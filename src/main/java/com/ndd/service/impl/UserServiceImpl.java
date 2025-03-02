package com.ndd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ndd.entity.user.UserEntity;
import com.ndd.repository.UserRepository;
import com.ndd.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

}
