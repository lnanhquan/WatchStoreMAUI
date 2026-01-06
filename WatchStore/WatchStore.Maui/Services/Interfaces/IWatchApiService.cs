using WatchStore.Maui.Models.Watch;

namespace WatchStore.Maui.Services.Interfaces
{
    public interface IWatchApiService
    {
        Task<List<WatchUserDTO>> GetWatchesAsync();

        Task<List<WatchAdminDTO>> GetWatchesAdminAsync();
    }
}
