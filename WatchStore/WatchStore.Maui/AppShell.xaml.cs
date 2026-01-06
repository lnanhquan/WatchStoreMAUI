using WatchStore.Maui.Services.Interfaces;
using WatchStore.Maui.ViewModels;
using WatchStore.Maui.Views;

namespace WatchStore.Maui;

public partial class AppShell : Shell
{
    private readonly ShellViewModel _vm;

    private readonly INavigationService _navigationService;

    public AppShell(ShellViewModel vm, INavigationService navigationService)
    {
        InitializeComponent();

        Routing.RegisterRoute(AppRoutes.Register, typeof(RegisterPage)); 
        Routing.RegisterRoute(AppRoutes.WatchList, typeof(WatchListPage)); 
        Routing.RegisterRoute(AppRoutes.WatchManagement, typeof(WatchManagementPage));

        _vm = vm;
        _navigationService = navigationService;

        BindingContext = _vm;

        Navigated += (_, e) => _vm.UpdateNavigation(e);
    }

    protected override async void OnAppearing()
    {
        base.OnAppearing();

        if (_vm.IsLoggedIn)
        {
            await _navigationService.NavigateAsync("//main");
        }
    }
}
