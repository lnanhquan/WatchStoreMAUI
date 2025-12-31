using Microsoft.Extensions.Logging;
using Telerik.Maui.Controls.Compatibility;
using WatchStore.Maui.Services;
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
            .ConfigureFonts(fonts =>
            {
                fonts.AddFont("OpenSans-Regular.ttf", "OpenSansRegular");
                fonts.AddFont("OpenSans-Semibold.ttf", "OpenSansSemibold");
            });
        builder.Services.AddSingleton<App>();

        // Token
        builder.Services.AddHttpClient("TokenClient", client =>
        {
            client.BaseAddress = new Uri("https://localhost:7123/");
        });
        builder.Services.AddTransient<TokenApiService>();

        // Client
        builder.Services.AddTransient<AuthTokenHandler>();
        builder.Services.AddHttpClient("ApiClient", client =>
        { 
            client.BaseAddress = new Uri("https://localhost:7123/"); 
        }) 
        .AddHttpMessageHandler<AuthTokenHandler>(); 
        
        // Services
        builder.Services.AddSingleton<WatchApiService>(); 
        builder.Services.AddSingleton<AuthApiService>();

        // ViewModels
        builder.Services.AddTransient<WatchListViewModel>();
        builder.Services.AddTransient<WatchManagementViewModel>();
        builder.Services.AddTransient<AuthViewModel>();

        // Pages
        builder.Services.AddTransient<MainPage>();
        builder.Services.AddTransient<WatchListPage>();
        builder.Services.AddTransient<WatchManagementPage>();
        builder.Services.AddTransient<RegisterPage>();
        builder.Services.AddTransient<LoginPage>();

#if DEBUG
        builder.Logging.AddDebug();
#endif

        return builder.Build();
    }
}
