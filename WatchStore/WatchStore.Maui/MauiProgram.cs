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

        // Pages
        builder.Services.AddTransient<MainPage>();
        builder.Services.AddTransient<WatchListPage>();
        builder.Services.AddTransient<WatchManagementPage>();

        // ViewModels
        builder.Services.AddTransient<WatchListViewModel>();
        builder.Services.AddTransient<WatchManagementViewModel>();

        // Services
        builder.Services.AddSingleton<WatchApiService>();

#if DEBUG
        builder.Logging.AddDebug();
#endif

        return builder.Build();
    }
}
