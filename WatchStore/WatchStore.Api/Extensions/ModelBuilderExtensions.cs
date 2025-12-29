using Microsoft.EntityFrameworkCore;
using WatchStore.Api.Models.Base;

namespace WatchStore.Api.Extensions;

public static class ModelBuilderExtensions
{
    public static void ApplyAuditableConfiguration(this ModelBuilder modelBuilder)
    {
        var auditableTypes = modelBuilder.Model
            .GetEntityTypes()
            .Where(t => typeof(AuditableEntity).IsAssignableFrom(t.ClrType));

        foreach (var type in auditableTypes)
        {
            var entity = modelBuilder.Entity(type.ClrType);
            entity.Property("CreatedAt").IsRequired();
            entity.Property("Version").IsRequired();
            entity.HasIndex("IsDeleted");
        }
    }
}
