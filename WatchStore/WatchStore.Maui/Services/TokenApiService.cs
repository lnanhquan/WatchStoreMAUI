using System.Net.Http.Json;
using WatchStore.Maui.Models.Auth;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.Services;
public class TokenApiService : ITokenApiService
{
    private readonly HttpClient _httpClient;

    public TokenApiService(IHttpClientFactory factory)
    {
        _httpClient = factory.CreateClient("TokenClient");
    }

    public async Task<LoginResponseDTO?> RefreshTokenAsync()
    {
        var refreshToken = await SecureStorage.Default.GetAsync("refresh_token");
        if (string.IsNullOrEmpty(refreshToken))
        {
            return null;
        }

        var response = await _httpClient.PostAsJsonAsync("api/auth/refresh-token",
            new RefreshTokenDTO { RefreshToken = refreshToken });

        if (!response.IsSuccessStatusCode)
        {
            return null;
        }

        var result = await response.Content.ReadFromJsonAsync<LoginResponseDTO>();

        if (result != null)
        {
            await SecureStorage.Default.SetAsync("access_token", result.AccessToken);
            await SecureStorage.Default.SetAsync("refresh_token", result.RefreshToken);
            await SecureStorage.Default.SetAsync("access_token_expiration", result.AccessTokenExpiration.ToString("O"));
        }

        return result;
    }

    public void Clear()
    {
        SecureStorage.Default.Remove("access_token");
        SecureStorage.Default.Remove("refresh_token");
        SecureStorage.Default.Remove("access_token_expiration");
        Preferences.Default.Remove("user");
    }
}
