using AutoMapper;
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

    public async Task<IdentityResult> RegisterAsync(RegisterDTO dto)
    {   
        var existingEmail = await _userManager.FindByEmailAsync(dto.Email);
        if (existingEmail != null)
        {
            return IdentityResult.Failed(new IdentityError
            {
                Description = "Email is already taken."
            });
        }

        var existingUserName = await _userManager.FindByNameAsync(dto.UserName);
        if (existingUserName != null)
        {
            return IdentityResult.Failed(new IdentityError
            {
                Description = "UserName is already taken."
            });
        }
        var user = new User
        {
            UserName = dto.UserName,
            Email = dto.Email,
            EmailConfirmed = true
        };

        var result = await _userManager.CreateAsync(user, dto.Password);

        if (!result.Succeeded)
        {
            _logger.LogWarning(
                "Registration failed for {Email}: {Errors}",
                dto.Email,
                string.Join(", ", result.Errors.Select(e => e.Description))
            );
            return result;
        }

        await _userManager.AddToRoleAsync(user, "User");

        _logger.LogInformation("User {UserName} registered successfully with email {Email}", user.UserName, user.Email);

        return result;
    }

    public async Task<LoginResponseDTO?> LoginAsync(LoginRequestDTO dto)
    {
        var user = await _userManager.FindByEmailAsync(dto.Email);
        if (user == null)
        {
            _logger.LogWarning("Login failed: Email {Email} not found", dto.Email);
            return null;
        }

        var valid = await _signInManager.CheckPasswordSignInAsync(user, dto.Password, false);
        if (!valid.Succeeded)
        {
            _logger.LogWarning("Login failed for {Email}: Invalid password", dto.Email);
            return null;
        }

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

        _logger.LogInformation("User {UserName} logged in", user.UserName);

        return response;
    }

    public async Task<LoginResponseDTO?> RefreshTokenAsync(string refreshToken)
    {
        var hash = _tokenService.HashToken(refreshToken);

        var user = await _userManager.Users.FirstOrDefaultAsync(u => u.RefreshToken == hash);

        if (user == null)
        {
            _logger.LogWarning("Refresh token invalid: No matching user found");
            return null;
        }

        if (user.RefreshTokenExpiryTime < DateTime.UtcNow)
        {
            _logger.LogWarning("Refresh token expired for user {UserId}", user.Id);
            return null;
        }

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

        _logger.LogInformation("Refresh token successfully issued for user {UserName}", user.UserName);

        return response;
    }

    public async Task<bool> LogoutAsync(string userId)
    {
        var user = await _userManager.FindByIdAsync(userId);
        if (user == null)
        {
            _logger.LogWarning("Logout failed: User {UserId} not found", userId);
            return false;
        }

        user.RefreshToken = null;
        user.RefreshTokenExpiryTime = null;

        await _userManager.UpdateAsync(user);

        _logger.LogInformation("User {UserId} logged out successfully", userId);

        return true;
    }
}
