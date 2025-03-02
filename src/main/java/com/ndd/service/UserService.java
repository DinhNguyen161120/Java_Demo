package com.ndd.service;

import org.springframework.stereotype.Service;

import com.ndd.entity.user.UserEntity;

@Service
public interface UserService {

    UserEntity createUser(UserEntity userEntity);

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
}
