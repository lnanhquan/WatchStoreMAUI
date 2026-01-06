using System.Net.Http.Json;
using WatchStore.Maui.Models.Watch;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.Services;

public class WatchApiService : IWatchApiService
{
    private readonly HttpClient _httpClient;

    public WatchApiService(IHttpClientFactory factory)
    {
        _httpClient = factory.CreateClient("ApiClient");
    }

    public async Task<List<WatchUserDTO>> GetWatchesAsync()
    {
        return await _httpClient
            .GetFromJsonAsync<List<WatchUserDTO>>("api/watches") ?? new List<WatchUserDTO>();
    }

    public async Task<List<WatchAdminDTO>> GetWatchesAdminAsync()
    {
        return await _httpClient
            .GetFromJsonAsync<List<WatchAdminDTO>>("api/watches/admin") ?? new List<WatchAdminDTO>();
    }
}
