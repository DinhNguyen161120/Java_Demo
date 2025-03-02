package com.ndd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndd.entity.user.UserEntity;
import com.ndd.repository.UserRepository;
import com.ndd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByUserNameAndUserEmail(String username, String userEmail) {
        return userRepository.findByUserNameAndUserEmail(username, userEmail);
    }

}
