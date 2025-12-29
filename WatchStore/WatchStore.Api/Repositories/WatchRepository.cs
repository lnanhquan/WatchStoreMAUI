using Microsoft.EntityFrameworkCore;
using WatchStore.Api.Data;
using WatchStore.Api.Models.Entities;

namespace WatchStore.Api.Repositories;

public class WatchRepository : GenericRepository<Watch>, IWatchRepository
{
    private readonly AppDbContext _db;

    public WatchRepository(AppDbContext db) : base(db)
    {
        _db = db;
    }

    public async Task<Watch?> GetByNameAsync(string name)
    {
        return await _db.Watches
            .FirstOrDefaultAsync(w => w.Name == name);
    }
}
