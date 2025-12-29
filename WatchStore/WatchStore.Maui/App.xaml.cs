namespace WatchStore.Maui;

public partial class App : Application
{
    private readonly IServiceProvider _serviceProvider;

    public App(IServiceProvider serviceProvider)
    {
        InitializeComponent();
        Application.Current.UserAppTheme = AppTheme.Light;
        //TelerikThemeResources.AppTheme = TelerikTheme.PlatformDark;
        _serviceProvider = serviceProvider;
    }

    protected override Window CreateWindow(IActivationState? activationState)
    {
        var mainPage = _serviceProvider.GetRequiredService<MainPage>();
        return new Window(new NavigationPage(mainPage));
    }
}