using WatchStore.Maui.ViewModels;

namespace WatchStore.Maui.Views;

public partial class WatchListPage : ContentPage
{
    public WatchListPage(WatchListViewModel vm)
    {
        InitializeComponent();
        BindingContext = vm;
    }

    protected override async void OnAppearing()
    {
        base.OnAppearing();

        if (BindingContext is WatchListViewModel vm)
        {
            await vm.LoadWatchesCommand.ExecuteAsync(null);
        }
    }
}