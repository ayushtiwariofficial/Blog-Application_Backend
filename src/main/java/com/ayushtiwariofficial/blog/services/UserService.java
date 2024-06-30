package com.ayushtiwariofficial.blog.services;

import java.util.List;

import com.ayushtiwariofficial.blog.entities.User;
import com.ayushtiwariofficial.blog.payloads.UserDto;

public interface UserService {
    
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer UserId); 
    UserDto getUserById(Integer UserId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer UserId);

}
