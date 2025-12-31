using System.Text.RegularExpressions;

namespace WatchStore.Maui.Constants;

public static class AuthConstants
{
    public const int MinUserNameLength = 3;

    public const int MaxUserNameLength = 50;

    public const int MinPasswordLength = 6;

    public const int MaxPasswordLength = 100;

    public const int RefreshTokenBytes = 64;

    public const string PasswordRegex = @"(?=.*[a-z])(?=.*[A-Z])(?=.*\d).+";

    public const string EmailRegex = @"^[^@\s]+@[^@\s]+\.[^@\s]+$";

    public static bool IsValidEmail(string email)
    {
        if (string.IsNullOrWhiteSpace(email))
            return false;

        return Regex.IsMatch(email, EmailRegex, RegexOptions.IgnoreCase);
    }

    public static bool IsValidPassword(string password)
    {
        if (string.IsNullOrWhiteSpace(password))
            return false;

        return Regex.IsMatch(password, PasswordRegex);
    }
}
