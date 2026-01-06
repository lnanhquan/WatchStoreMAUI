namespace WatchStore.Maui;

public partial class App : Application
{
    private readonly AppShell _shell;

    public App(AppShell shell)
    {
        InitializeComponent();
        string savedTheme = Preferences.Default.Get("app_theme", "Light");
        if (Enum.TryParse(savedTheme, out AppTheme theme))
        {
            this.UserAppTheme = theme;
        }
        else
        {
            this.UserAppTheme = AppTheme.Light;
        }    
        this.RequestedThemeChanged += (s, e) => ApplyTelerikTheme();
        this.ApplyTelerikTheme();
        _shell = shell;
    }

    protected override Window CreateWindow(IActivationState? activationState)
    {
        return new Window(_shell);
    }

    private void ApplyTelerikTheme()
    {

        if (this.RequestedTheme == AppTheme.Dark)
        {
            TelerikThemeResources.AppTheme = TelerikTheme.PlatformDark;
        }
        else TelerikThemeResources.AppTheme = TelerikTheme.PlatformLight;
    }
}