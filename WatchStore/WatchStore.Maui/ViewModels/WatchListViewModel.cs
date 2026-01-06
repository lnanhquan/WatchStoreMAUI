using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using System.Collections.ObjectModel;
using WatchStore.Maui.Models.Watch;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.ViewModels;

public partial class WatchListViewModel : ObservableObject
{
    private readonly IWatchApiService _watchService;

    [ObservableProperty]
    private bool isLoading;

    public ObservableCollection<WatchUserDTO> Watches { get; } = new();

    public WatchListViewModel(IWatchApiService apiService)
    {
        _watchService = apiService;
    }

    [RelayCommand]
    private async Task LoadWatchesAsync()
    {
        IsLoading = true;
        try
        {
            var watches = await _watchService.GetWatchesAsync();
            Watches.Clear();
            foreach (var w in watches)
                Watches.Add(w);
        }
        finally
        {
            IsLoading = false;
        }
    }
}
