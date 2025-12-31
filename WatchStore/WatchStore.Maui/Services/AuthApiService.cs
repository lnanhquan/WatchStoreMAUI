using System.Net.Http.Json;
using System.Text.Json;
using WatchStore.Maui.Models.Auth;

namespace WatchStore.Maui.Services;
public class AuthApiService
{
    private readonly HttpClient _httpClient;

    public AuthApiService(IHttpClientFactory factory)
    {
        _httpClient = factory.CreateClient("ApiClient");
    }

    public async Task<bool> IsEmailAvailableAsync(string email)
    {
        try
        {
            var exists = await _httpClient.GetFromJsonAsync<bool>($"api/auth/check-email?email={Uri.EscapeDataString(email)}");
            return !exists; 
        }
        catch
        {
            return false;
        }
    }

    public async Task<bool> IsUserNameAvailableAsync(string username)
    {
        try
        {
            var exists = await _httpClient.GetFromJsonAsync<bool>($"api/auth/check-username?username={Uri.EscapeDataString(username)}"); 
            return !exists;
        }
        catch
        {
            return false;
        }
    }

    public async Task<bool> RegisterAsync(RegisterDTO dto)
    {
        var response = await _httpClient.PostAsJsonAsync("api/auth/register", dto);
        return response.IsSuccessStatusCode;
    }

    public async Task<bool> LoginAsync(LoginRequestDTO dto)
    {
        var response = await _httpClient.PostAsJsonAsync("api/auth/login", dto);
        if (!response.IsSuccessStatusCode) return false;

        var result = await response.Content.ReadFromJsonAsync<LoginResponseDTO>();
        if (result != null && !string.IsNullOrEmpty(result.AccessToken))
        {
            await SecureStorage.Default.SetAsync("access_token", result.AccessToken);
            await SecureStorage.Default.SetAsync("refresh_token", result.RefreshToken);
            await SecureStorage.Default.SetAsync("access_token_expiration", result.AccessTokenExpiration.ToString("O"));
            Preferences.Default.Set("user", JsonSerializer.Serialize(result.User));

            return true;
        }
        return false;
    }

    public async Task<LoginResponseDTO?> RefreshTokenAsync(string refreshToken)
    {
        var dto = new RefreshTokenDTO { RefreshToken = refreshToken };
        var response = await _httpClient.PostAsJsonAsync("api/auth/refresh-token", dto);
        if (response.IsSuccessStatusCode)
        {
            return await response.Content.ReadFromJsonAsync<LoginResponseDTO>();
        }
        return null;
    }

    public async Task<bool> LogoutAsync()
    {
        var response = await _httpClient.PostAsync("api/auth/logout", null);
        return response.IsSuccessStatusCode;
    }
}
