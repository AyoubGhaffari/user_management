package com.ayoub.gestionutilisateurs.domain.service.mapper;

import com.ayoub.gestionutilisateurs.data.model.User;
import com.ayoub.gestionutilisateurs.domain.dto.UserDto;

public class UserMapper {

    // convert Entity into DTO
    public static UserDto mapToDTO(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    // convert DTO to entity
    public static User mapToEntity(UserDto userDto){
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        return user;
    }
}
