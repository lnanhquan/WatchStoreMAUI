namespace WatchStore.Api.Repositories.Interfaces;

public interface IUnitOfWork : IDisposable
{
    IWatchRepository Watches { get; }

    Task<int> SaveChangesAsync();
}
