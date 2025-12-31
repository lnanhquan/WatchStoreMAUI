using WatchStore.Maui.ViewModels;
using WatchStore.Maui.Views;

namespace WatchStore.Maui;

public partial class MainPage : ContentPage
{

    public MainPage(AuthViewModel authViewModel)
    {
        InitializeComponent();
        BindingContext = authViewModel;
    }

    private async void OnWatchListClicked(object sender, EventArgs e)
    {
        await Shell.Current.GoToAsync(nameof(WatchListPage));
    }

    private async void OnWatchManagementClicked(object sender, EventArgs e)
    {
        await Shell.Current.GoToAsync(nameof(WatchManagementPage));
    }
}
