package com.ndd.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ndd.entity.user.UserEntity;

@Service
public interface UserService {

    UserEntity createUser(UserEntity userEntity);

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    Page<UserEntity> findAllUser(Pageable pageable);

    Page<UserEntity> findByUserName(String name, Pageable pageable);
}
