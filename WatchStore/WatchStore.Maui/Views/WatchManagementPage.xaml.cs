using WatchStore.Maui.ViewModels;

namespace WatchStore.Maui.Views;

public partial class WatchManagementPage : ContentPage
{
	public WatchManagementPage(WatchManagementViewModel vm)
	{
		InitializeComponent();
		BindingContext = vm;
    }

    protected override async void OnAppearing()
    {
        base.OnAppearing();

        if (BindingContext is WatchManagementViewModel vm)
        {
            await vm.LoadWatchesAdminCommand.ExecuteAsync(null);
        }
    }
}