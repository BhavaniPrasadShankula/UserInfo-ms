package com.foodzy.UserInfo.mapper;

import com.foodzy.UserInfo.dto.UserDTO;
import com.foodzy.UserInfo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);
}
