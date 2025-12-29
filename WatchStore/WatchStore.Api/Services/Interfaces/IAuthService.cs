using Microsoft.AspNetCore.Identity;
using WatchStore.Api.DTOs.Auth;

namespace WatchStore.Api.Services.Interfaces;

public interface IAuthService
{
    Task<IdentityResult> RegisterAsync(RegisterDTO model);

    Task<LoginResponseDTO?> LoginAsync(LoginRequestDTO model);

    Task<LoginResponseDTO?> RefreshTokenAsync(string refreshToken);

    Task<bool> LogoutAsync(string userId);
}
