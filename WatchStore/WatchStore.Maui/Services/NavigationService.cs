using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.Services
{
    class NavigationService : INavigationService
    {
        public async Task NavigateAsync(string route, bool animated = true)
        {
            await MainThread.InvokeOnMainThreadAsync(() =>
                Shell.Current.GoToAsync(route, animated)
            );
        }

        public async Task GoBackAsync(bool animated = true)
        {
            await MainThread.InvokeOnMainThreadAsync(() =>
                Shell.Current.GoToAsync("..", animated)
            );
        }
    }
}
