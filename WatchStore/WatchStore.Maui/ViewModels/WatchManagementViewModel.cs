using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using System.Collections.ObjectModel;
using WatchStore.Maui.Models.Watch;
using WatchStore.Maui.Services.Interfaces;

namespace WatchStore.Maui.ViewModels;

public partial class WatchManagementViewModel : ObservableObject
{
    private readonly IWatchApiService _watchService;

    [ObservableProperty]
    private bool isLoading;

    public ObservableCollection<WatchAdminDTO> Watches { get; } = new();

    public WatchManagementViewModel(IWatchApiService apiService)
    {
        _watchService = apiService;
    }

    [RelayCommand]
    public async Task LoadWatchesAdminAsync()
    {
        IsLoading = true;
        try
        {
            var watches = await _watchService.GetWatchesAdminAsync();
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
