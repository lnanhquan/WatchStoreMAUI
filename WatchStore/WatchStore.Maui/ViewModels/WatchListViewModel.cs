using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using System.Collections.ObjectModel;
using WatchStore.Maui.Models.Watch;
using WatchStore.Maui.Services;

namespace WatchStore.Maui.ViewModels;

public partial class WatchListViewModel : ObservableObject
{
    private readonly WatchApiService _apiService;

    [ObservableProperty]
    private bool isLoading;

    public ObservableCollection<WatchUserDTO> Watches { get; } = new();

    public WatchListViewModel(WatchApiService apiService)
    {
        _apiService = apiService;
    }

    [RelayCommand]
    private async Task LoadWatchesAsync()
    {
        IsLoading = true;
        try
        {
            var watches = await _apiService.GetWatchesAsync();
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
