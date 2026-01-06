using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using WatchStore.Maui.Constants;
using WatchStore.Maui.Models.Auth;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.ViewModels;

public partial class AuthViewModel : ObservableObject
{
    private readonly IAuthApiService _authApiService;

    private readonly INavigationService _navigationService;

    [ObservableProperty] private string email;

    [ObservableProperty] private string userName;

    [ObservableProperty] private string password;

    [ObservableProperty] private string confirmPassword;

    [ObservableProperty] private string errorMessage;

    [ObservableProperty] private bool isBusy;

    public AuthViewModel(IAuthApiService authApiService, INavigationService navigationService)
    {
        _authApiService = authApiService;
        _navigationService = navigationService;
    }

    [RelayCommand]
    public async Task GoToRegisterAsync()
    {
        await _navigationService.NavigateAsync(AppRoutes.Register);
    }

    [RelayCommand]
    public async Task RegisterAsync()
    {
        if (IsBusy) return;
        IsBusy = true;
        ErrorMessage = string.Empty;

        try
        {
            if (string.IsNullOrWhiteSpace(Email) ||
                string.IsNullOrWhiteSpace(UserName) ||
                string.IsNullOrWhiteSpace(Password))
            {
                ErrorMessage = "Please fill all required fields.";
                return;
            }

            if (!AuthConstants.IsValidEmail(Email))
            {
                ErrorMessage = "Invalid email format.";
                return;
            }

            if (!AuthConstants.IsValidPassword(Password))
            {
                ErrorMessage = "Password must contain uppercase, lowercase and number.";
                return;
            }

            if (Password != ConfirmPassword)
            {
                ErrorMessage = "Passwords do not match.";
                return;
            }

            if (!await _authApiService.IsEmailAvailableAsync(Email))
            {
                ErrorMessage = "Email is already in use.";
                return;
            }

            if (!await _authApiService.IsUserNameAvailableAsync(UserName))
            {
                ErrorMessage = "UserName is already in use.";
                return;
            }

            var dto = new RegisterDTO
            {
                Email = Email,
                UserName = UserName,
                Password = Password,
                ConfirmPassword = ConfirmPassword
            };

            var success = await _authApiService.RegisterAsync(dto);

            if (!success)
            {
                ErrorMessage = "Registration failed. Try again.";
            }

            await Shell.Current.DisplayAlert("Success", "Registered successfully!", "OK");

            await _navigationService.NavigateAsync("//login");
        }
        finally
        {
            IsBusy = false;
        }
    }

    [RelayCommand]
    public async Task LoginAsync()
    {
        if (IsBusy) return;
        IsBusy = true;
        ErrorMessage = string.Empty;

        try
        {
            if (string.IsNullOrWhiteSpace(Email) || string.IsNullOrWhiteSpace(Password))
            {
                ErrorMessage = "Please fill all required fields.";
                return;
            }

            if (!AuthConstants.IsValidEmail(Email))
            {
                ErrorMessage = "Invalid email format.";
                return;
            }

            var dto = new LoginRequestDTO
            {
                Email = Email,
                Password = Password
            };

            var success = await _authApiService.LoginAsync(dto);

            if (success)
            {
                await Shell.Current.DisplayAlert("Success", "Logged in successfully!", "OK");

                await _navigationService.NavigateAsync("//main");
            }
            else
            {
                ErrorMessage = "Email or password incorrect.";
            }
        }
        catch (Exception ex)
        {
            ErrorMessage = "Login error: " + ex.Message;
        }
        finally
        {
            IsBusy = false;
        }
    }
}
