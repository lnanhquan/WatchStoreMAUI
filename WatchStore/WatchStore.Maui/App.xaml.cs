using WatchStore.Maui.Views;

namespace WatchStore.Maui;

public partial class App : Application
{
    public App()
    {
        InitializeComponent();
        Application.Current.UserAppTheme = AppTheme.Light;
        //TelerikThemeResources.AppTheme = TelerikTheme.PlatformDark;
    }

    protected override Window CreateWindow(IActivationState? activationState)
    {
        return new Window(new AppShell());
    }
}