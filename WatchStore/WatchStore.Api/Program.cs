using WatchStore.Api.Extensions;
using WatchStore.Api.Options;

var builder = WebApplication.CreateBuilder(args);

// Configure Services
builder.Services.Configure<JwtOptions>(builder.Configuration.GetSection("Jwt"));
builder.Services.Configure<ImageOptions>(builder.Configuration.GetSection("Image"));

builder.Services.AddEndpointsApiExplorer();
builder.Services.ConfigureDbAndIdentity(builder.Configuration);
builder.Services.ConfigureRepositoriesAndServices();
builder.Services.ConfigureJwtAuthentication(builder.Configuration);
builder.Services.AddAutoMapper(typeof(Program));
builder.Services.AddControllers();
builder.Services.ConfigureSwagger();

var app = builder.Build();

// Middleware
app.UseHttpsRedirection();
app.UseAuthentication();
app.UseAuthorization();
app.UseStaticFiles();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

// Seed admin user
await app.SeedAdminUserAsync();

app.MapControllers();
app.Run();
