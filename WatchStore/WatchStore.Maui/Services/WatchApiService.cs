using System.Net.Http.Json;
using WatchStore.Maui.Models.Watch;

namespace WatchStore.Maui.Services;

public class WatchApiService
{
    private readonly HttpClient _httpClient;

    public WatchApiService()
    {
        _httpClient = new HttpClient
        {
            BaseAddress = new Uri("https://localhost:7123/")
        };
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
