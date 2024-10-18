package com.foodzy.UserInfo.service;

import com.foodzy.UserInfo.dto.UserDTO;
import com.foodzy.UserInfo.entity.User;
import com.foodzy.UserInfo.mapper.UserMapper;
import com.foodzy.UserInfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
     UserRepo userRepo;

    @Autowired
    UserMapper userMapper;

    public UserDTO addUserToDB(UserDTO userDTO) {
        User savedUser = userRepo.save(userMapper.mapUserDTOToUser(userDTO));
        return userMapper.mapUserToUserDTO(savedUser);
    }
}
