package com.ndd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ndd.entity.user.UserEntity;

// Learn => https://docs.spring.io/spring-data/jpa/reference/jpa/getting-started.html
// Add JpaSpecificationExecutor<UserEntity> for raw query
public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    // 25:00 JAVA 06: https://www.youtube.com/watch?v=EwSrtrk7Kq0&t=17s
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail); // add more query

    // use when added JpaSpecificationExecutor
    @Query("Select user from UserEntity where user.id = (Select MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxUserId();

    // pass params into SQL query
    @Query("Select user from UserEntity where user.userName = ?1 AND user.userEmail = ?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    // pass params into SQL query
    @Query("Select user from UserEntity where user.userName = :userName AND user.userEmail = :userEmail")
    List<UserEntity> getUserEntityByTwo(@Param("userName") String userName, @Param("userEmail") String userEmail);

}
