package com.ndd.service;

import java.util.List;

import com.ndd.entity.user.UserEntity;

public interface UserService {

    UserEntity createUser(UserEntity userEntity);

    List<UserEntity> getAllUser();
}
