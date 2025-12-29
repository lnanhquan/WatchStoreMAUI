namespace WatchStore.Api.DTOs.Auth;

public class LoginResponseDTO
{
    public string AccessToken { get; set; }

    public DateTime AccessTokenExpiration { get; set; }

    public string RefreshToken { get; set; }

    public UserDTO User { get; set; }
}
