package com.ipoca.spring.cloud.consumermovie.controller;

import com.ipoca.spring.cloud.consumermovie.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xubang
 * @Date 2021/8/4 16:54
 */
@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        return user;
    }
}
