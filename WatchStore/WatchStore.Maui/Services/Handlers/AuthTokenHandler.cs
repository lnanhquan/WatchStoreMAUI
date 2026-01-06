using System.Net.Http.Headers;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.Services.Handlers;

public class AuthTokenHandler : DelegatingHandler
{
    private readonly ITokenApiService _tokenApiService;
    private static readonly SemaphoreSlim _refreshLock = new(1, 1);

    public AuthTokenHandler(ITokenApiService tokenApiService)
    {
        _tokenApiService = tokenApiService;
    }

    protected override async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken cancellationToken)
    {
        if (request.RequestUri!.AbsolutePath.StartsWith("/api/"))
        {
            await AddAccessTokenAsync(request);
        }

        var response = await base.SendAsync(request, cancellationToken);

        if (response.StatusCode == System.Net.HttpStatusCode.Unauthorized)
        {
            var success = await TryRefreshTokenAsync();

            if (success)
            {
                request.Headers.Authorization = new AuthenticationHeaderValue(
                    "Bearer", await SecureStorage.Default.GetAsync("access_token"));

                return await base.SendAsync(request, cancellationToken);
            }
        }

        return response;
    }

    private async Task AddAccessTokenAsync(HttpRequestMessage request)
    {
        var token = await SecureStorage.Default.GetAsync("access_token");
        var expiresAt = await SecureStorage.Default.GetAsync("access_token_expiration");

        if (DateTime.TryParse(expiresAt, out var exp) && exp <= DateTime.UtcNow.AddMinutes(1))
        {
            await TryRefreshTokenAsync();
            token = await SecureStorage.Default.GetAsync("access_token");
        }

        if (!string.IsNullOrEmpty(token))
        {
            request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", token);
        }
    }

    private async Task<bool> TryRefreshTokenAsync()
    {
        await _refreshLock.WaitAsync();

        try
        {
            var response = await _tokenApiService.RefreshTokenAsync();
            return response != null;
        }
        finally
        {
            _refreshLock.Release();
        }
    }
}
