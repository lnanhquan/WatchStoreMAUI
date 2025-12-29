using System.ComponentModel.DataAnnotations;

namespace WatchStore.Api.DTOs.Auth;

public class RefreshTokenDTO
{
    [Required]
    public string RefreshToken { get; set; }
}
