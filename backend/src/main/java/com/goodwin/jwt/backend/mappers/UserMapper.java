package com.goodwin.jwt.backend.mappers;

import com.goodwin.jwt.backend.dtos.SignUpDto;
import com.goodwin.jwt.backend.dtos.UserDto;
import com.goodwin.jwt.backend.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
