package com.ipoca.spring.cloud.provideruser.dao;

import com.ipoca.spring.cloud.provideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author xubang
 * @Date 2021/8/4 11:13
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
