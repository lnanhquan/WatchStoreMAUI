using WatchStore.Api.Models.Entities;

namespace WatchStore.Api.Services.Interfaces;

public interface ITokenService
{
    (string accessToken, DateTime expires) GenerateAccessToken(User user, IList<string> roles);

    string GenerateRefreshToken();

    string HashToken(string token);
}
