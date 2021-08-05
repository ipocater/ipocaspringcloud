package com.ipoca.spring.cloud.provideruser.controller;


import com.ipoca.spring.cloud.provideruser.dao.UserRepository;
import com.ipoca.spring.cloud.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author xubang
 * @Date 2021/8/4 14:47
 */
@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return this.userRepository.findById(id);
    }
}
