using WatchStore.Api.Data;
using WatchStore.Api.Repositories.Interfaces;

namespace WatchStore.Api.Repositories;

public class UnitOfWork : IUnitOfWork
{
    private readonly AppDbContext _db;

    public IWatchRepository Watches { get; }

    public UnitOfWork(AppDbContext db)
    {
        _db = db;

        Watches = new WatchRepository(_db);
    }

    public async Task<int> SaveChangesAsync()
    {
        return await _db.SaveChangesAsync();
    }

    public void Dispose()
    {
        _db.Dispose();
    }
}
