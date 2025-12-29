using WatchStore.Api.Models.Entities;
using WatchStore.Api.Repositories.Interfaces;

public interface IWatchRepository : IGenericRepository<Watch>
{
    Task<Watch?> GetByNameAsync(string name);
}
