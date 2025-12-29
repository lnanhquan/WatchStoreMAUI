using WatchStore.Maui.Views;

namespace WatchStore.Maui;

public partial class MainPage : ContentPage
{
    private readonly IServiceProvider _serviceProvider;

    public MainPage(IServiceProvider serviceProvider)
    {
        InitializeComponent();
        _serviceProvider = serviceProvider;
    }

    private async void OnWatchListClicked(object sender, EventArgs e)
    {
        var page = _serviceProvider.GetRequiredService<WatchListPage>();
        await Navigation.PushAsync(page);
    }

    private async void OnWatchManagementClicked(object sender, EventArgs e)
    {
        var page = _serviceProvider.GetRequiredService<WatchManagementPage>();
        await Navigation.PushAsync(page);
    }
}
