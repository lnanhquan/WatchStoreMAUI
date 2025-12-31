using System.ComponentModel.DataAnnotations;

namespace WatchStore.Maui.Models.Auth;

public class RefreshTokenDTO
{
    [Required]
    public string RefreshToken { get; set; }
}
