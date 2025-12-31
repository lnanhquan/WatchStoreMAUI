using AutoMapper;
using WatchStore.Api.DTOs;
using WatchStore.Api.DTOs.Auth;
using WatchStore.Api.DTOs.Watch;
using WatchStore.Api.Models.Entities;

namespace WatchStore.Api.Mappings;

public class AutoMapperProfile : Profile
{
    public AutoMapperProfile()
    {
        // Watch
        CreateMap<Watch, WatchUserDTO>()
            .ForMember(
                dest => dest.ImageUrl,
                opt => opt.MapFrom<WatchImageUrlResolver<WatchUserDTO>>()
            );

        CreateMap<Watch, WatchAdminDTO>()
            .ForMember(
                dest => dest.ImageUrl,
                opt => opt.MapFrom<WatchImageUrlResolver<WatchAdminDTO>>()
            );

        CreateMap<WatchCreateDTO, Watch>();

        CreateMap<WatchUpdateDTO, Watch>()
            .ForMember(dest => dest.ImageUrl, opt => opt.Ignore()); // ImageUrl is set after uploading the image

        // User
        CreateMap<User, UserDTO>()
            .ForMember(dest => dest.Roles, opt => opt.Ignore()); // get Roles from UserManager separately

        CreateMap<User, LoginResponseDTO>()
            .ForMember(dest => dest.User, opt => opt.MapFrom(src => src));

    }
}
