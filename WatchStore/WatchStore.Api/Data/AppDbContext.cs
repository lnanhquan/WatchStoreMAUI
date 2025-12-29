using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using WatchStore.Api.Data.Configurations;
using WatchStore.Api.Extensions;
using WatchStore.Api.Models.Entities;

namespace WatchStore.Api.Data;

public class AppDbContext : IdentityDbContext<User>
{
    public AppDbContext(DbContextOptions<AppDbContext> options) : base(options)
    {
    }

    public DbSet<Watch> Watches { get; set; } = null!;

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        base.OnModelCreating(modelBuilder);

        modelBuilder.ApplyAuditableConfiguration();

        modelBuilder.ApplyConfiguration(new WatchConfiguration());
    }
}
