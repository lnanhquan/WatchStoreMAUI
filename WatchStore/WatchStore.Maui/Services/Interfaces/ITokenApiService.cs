using WatchStore.Maui.Models.Auth;

namespace WatchStore.Maui.Services.Interfaces
{
    public interface ITokenApiService
    {
        Task<LoginResponseDTO?> RefreshTokenAsync();

        void Clear();
    }
}
