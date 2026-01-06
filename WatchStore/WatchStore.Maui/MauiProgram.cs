using CommunityToolkit.Maui;
using Microsoft.Extensions.Logging;
using Telerik.Maui.Controls.Compatibility;
using WatchStore.Maui.Services;
using WatchStore.Maui.Services.Handlers;
using WatchStore.Maui.Services.Interfaces;
using WatchStore.Maui.ViewModels;
using WatchStore.Maui.Views;

namespace WatchStore.Maui;
public static class MauiProgram
{
    public static MauiApp CreateMauiApp()
    {
        var builder = MauiApp.CreateBuilder();
        builder
            .UseTelerik()
            .UseMauiApp<App>()
            .UseMauiCommunityToolkit()
            .ConfigureFonts(fonts =>
            {
                fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
                fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
            });
        builder.Services.AddSingleton<App>();
        builder.Services.AddSingleton<AppShell>();

        // Token
        builder.Services.AddHttpClient("TokenClient", client =>
        {
            client.BaseAddress = new Uri("https://localhost:7123/");
        });
        builder.Services.AddTransient<ITokenApiService, TokenApiService>();

        // Client
        builder.Services.AddTransient<AuthTokenHandler>();
        builder.Services.AddHttpClient("ApiClient", client =>
        { 
            client.BaseAddress = new Uri("https://localhost:7123/"); 
        }) 
        .AddHttpMessageHandler<AuthTokenHandler>();

        // Services
        builder.Services.AddSingleton<INavigationService, NavigationService>();
        builder.Services.AddTransient<IAuthApiService, AuthApiService>();
        builder.Services.AddTransient<IWatchApiService, WatchApiService>();

        // ViewModels
        builder.Services.AddTransient<ShellViewModel>();
        builder.Services.AddTransient<WatchListViewModel>();
        builder.Services.AddTransient<WatchManagementViewModel>();
        builder.Services.AddTransient<AuthViewModel>();

        // Pages
        builder.Services.AddTransient<LoginPage>();
        builder.Services.AddTransient<RegisterPage>();
        builder.Services.AddTransient<MainPage>();
        builder.Services.AddTransient<WatchListPage>();
        builder.Services.AddTransient<WatchManagementPage>();     

#if DEBUG
        builder.Logging.AddDebug();
#endif

        return builder.Build();
    }
}
