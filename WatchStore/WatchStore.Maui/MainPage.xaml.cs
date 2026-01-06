using WatchStore.Maui.Services.Interfaces;
using WatchStore.Maui.ViewModels;

namespace WatchStore.Maui;

public partial class MainPage : ContentPage
{
    private readonly INavigationService _navigationService;

    public MainPage(AuthViewModel authViewModel, INavigationService navigationService)
    {
        InitializeComponent();
        _navigationService = navigationService;
        BindingContext = authViewModel;
    }

    private async void OnWatchListClicked(object sender, EventArgs e)
    {
        await _navigationService.NavigateAsync(AppRoutes.WatchList);
    }

    private async void OnWatchManagementClicked(object sender, EventArgs e)
    {
        await _navigationService.NavigateAsync(AppRoutes.WatchManagement);
    }
}
