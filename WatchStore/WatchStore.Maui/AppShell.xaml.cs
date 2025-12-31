using WatchStore.Maui.Views;

namespace WatchStore.Maui;

public partial class AppShell : Shell
{
    public AppShell()
    {
        InitializeComponent();
        Routing.RegisterRoute(nameof(RegisterPage), typeof(RegisterPage));
        Routing.RegisterRoute(nameof(WatchListPage), typeof(WatchListPage));
        Routing.RegisterRoute(nameof(WatchManagementPage), typeof(WatchManagementPage));
    }
}
