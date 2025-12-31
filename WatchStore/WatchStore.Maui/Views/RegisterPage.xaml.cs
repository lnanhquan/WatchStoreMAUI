using WatchStore.Maui.ViewModels;

namespace WatchStore.Maui.Views;

public partial class RegisterPage : ContentPage
{
	public RegisterPage(AuthViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
    }
}