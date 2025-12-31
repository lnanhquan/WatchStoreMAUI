using WatchStore.Maui.ViewModels;

namespace WatchStore.Maui.Views;

public partial class LoginPage : ContentPage
{
	public LoginPage(AuthViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
    }
}