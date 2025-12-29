using AutoMapper;
using Azure.Core;
using Microsoft.AspNetCore.Identity;
using Microsoft.EntityFrameworkCore;
using WatchStore.Api.DTOs.Auth;
using WatchStore.Api.Models.Entities;
using WatchStore.Api.Services.Interfaces;

namespace WatchStore.Api.Services;

public class AuthService : IAuthService
{
    private readonly UserManager<User> _userManager;
    private readonly SignInManager<User> _signInManager;
    private readonly ITokenService _tokenService;
    private readonly IMapper _mapper;
    private readonly ILogger<AuthService> _logger;

    public AuthService(
        UserManager<User> userManager,
        SignInManager<User> signInManager,
        ITokenService tokenService,
        IMapper mapper,
        ILogger<AuthService> logger)
    {
        _userManager = userManager;
        _signInManager = signInManager;
        _tokenService = tokenService;
        _mapper = mapper;
        _logger = logger;
    }

    public async Task<IdentityResult> RegisterAsync(RegisterDTO model)
    {
        var user = new User
        {
            UserName = model.UserName,
            Email = model.Email,
            EmailConfirmed = true
        };

        var result = await _userManager.CreateAsync(user, model.Password);

        if (result.Succeeded)
        {
            await _userManager.AddToRoleAsync(user, "User");
        }

        return result;
    }

    public async Task<LoginResponseDTO?> LoginAsync(LoginRequestDTO model)
    {
        var user = await _userManager.FindByEmailAsync(model.Email);
        if (user == null) return null;

        var valid = await _signInManager.CheckPasswordSignInAsync(user, model.Password, false);
        if (!valid.Succeeded) return null;

        var roles = await _userManager.GetRolesAsync(user);

        var (accessToken, expires) = _tokenService.GenerateAccessToken(user, roles);
        var refreshToken = _tokenService.GenerateRefreshToken();

        user.RefreshToken = _tokenService.HashToken(refreshToken);
        user.RefreshTokenExpiryTime = DateTime.UtcNow.AddDays(7);

        await _userManager.UpdateAsync(user);

        var response = _mapper.Map<LoginResponseDTO>(user);
        response.User.Roles = roles;
        response.AccessToken = accessToken;
        response.RefreshToken = refreshToken;
        response.AccessTokenExpiration = expires;

        return response;
    }

    public async Task<LoginResponseDTO?> RefreshTokenAsync(string refreshToken)
    {
        var hash = _tokenService.HashToken(refreshToken);

        var user = await _userManager.Users.FirstOrDefaultAsync(u => u.RefreshToken == hash);

        if (user == null || user.RefreshTokenExpiryTime < DateTime.UtcNow)
            return null;

        var roles = await _userManager.GetRolesAsync(user);

        var (newAccess, expires) = _tokenService.GenerateAccessToken(user, roles);
        var newRefresh = _tokenService.GenerateRefreshToken();

        user.RefreshToken = _tokenService.HashToken(newRefresh);
        user.RefreshTokenExpiryTime = DateTime.UtcNow.AddDays(7);

        await _userManager.UpdateAsync(user);

        var response = _mapper.Map<LoginResponseDTO>(user);
        response.User.Roles = roles;
        response.AccessToken = newAccess;
        response.RefreshToken = newRefresh;
        response.AccessTokenExpiration = expires;

        return response;
    }

    public async Task<bool> LogoutAsync(string userId)
    {
        var user = await _userManager.FindByIdAsync(userId);
        if (user == null) return false;

        user.RefreshToken = null;
        user.RefreshTokenExpiryTime = null;

        await _userManager.UpdateAsync(user);
        return true;
    }
}
