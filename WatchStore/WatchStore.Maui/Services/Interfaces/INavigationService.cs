namespace WatchStore.Maui.Services.Interfaces
{
    public interface INavigationService
    {
        Task NavigateAsync(string route, bool animated = true);

        Task GoBackAsync(bool animated = true);
    }
}
