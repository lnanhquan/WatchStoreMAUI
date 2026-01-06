using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.ViewModels;

public partial class ShellViewModel : ObservableObject
{
    private readonly ITokenApiService _tokenService;
    private readonly IAuthApiService _authService;
    private readonly INavigationService _navigationService;

    public ShellViewModel(ITokenApiService tokenService, IAuthApiService authService, INavigationService navigationService)
    {
        _tokenService = tokenService;
        _authService = authService;
        _navigationService = navigationService;

        IsLoggedIn = Preferences.Default.ContainsKey("user");
        
    }

    [ObservableProperty]
    private string pageTitle;

    [ObservableProperty]
    private bool isLoggedIn;

    [ObservableProperty]
    private bool canGoBack;


    public void UpdateNavigation(ShellNavigatedEventArgs e)
    {
        PageTitle = Shell.Current.CurrentPage?.Title ?? "Watch Store";

        CanGoBack = Shell.Current.Navigation.NavigationStack.Count > 1;

        IsLoggedIn = Preferences.Default.ContainsKey("user");
    }


    [RelayCommand]
    private async Task GoBack()
    {
        await _navigationService.GoBackAsync();
    }

    [RelayCommand]
    private async Task ChangeTheme()
    {
        var newTheme = Application.Current!.UserAppTheme == AppTheme.Light ? AppTheme.Dark : AppTheme.Light;
        Application.Current.UserAppTheme = newTheme;
        Preferences.Default.Set("app_theme", newTheme.ToString());
    }


    [RelayCommand]
    private async Task Logout()
    {
        bool confirm = await Shell.Current.DisplayAlert(
            "Confirm Logout",
            "Are you sure you want to log out?",
            "Yes", "No");

        if (!confirm)
            return;

        await _authService.LogoutAsync();
        _tokenService.Clear();

        Preferences.Default.Remove("user");
        IsLoggedIn = false;

        await Shell.Current.DisplayAlert("Success", "Logged out successfully!", "OK");

        await _navigationService.NavigateAsync("//login");
    }
}
