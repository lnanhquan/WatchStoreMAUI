using WatchStore.Maui.Models.Auth;

namespace WatchStore.Maui.Services.Interfaces
{
    public interface IAuthApiService
    {
        Task<bool> IsEmailAvailableAsync(string email);

        Task<bool> IsUserNameAvailableAsync(string username);

        Task<bool> RegisterAsync(RegisterDTO dto);

        Task<bool> LoginAsync(LoginRequestDTO dto);

        Task<bool> LogoutAsync();
    }
}
