using AutoMapper;
using Microsoft.Extensions.Options;
using WatchStore.Api.Models.Entities;
using WatchStore.Api.Options;

public class WatchImageUrlResolver<TDest> : IValueResolver<Watch, TDest, string?>
{
    private readonly ImageOptions _options;

    public WatchImageUrlResolver(IOptions<ImageOptions> options)
    {
        _options = options.Value;
    }

    public string? Resolve(
        Watch source,
        TDest destination,
        string? destMember,
        ResolutionContext context)
    {
        if (string.IsNullOrEmpty(source.ImageUrl))
            return null;

        var baseUrl = _options.BaseUrl.TrimEnd('/');
        var path = source.ImageUrl.TrimStart('/');

        return $"{baseUrl}/{path}";
    }
}
