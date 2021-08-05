package com.ipoca.spring.cloud.consumermovie.feign;

import com.ipoca.spring.cloud.consumermovie.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author xubang
 * @Date 2021/8/5 17:28
 */
@Component
@FeignClient(name = "IPOCA-PROVIDER-USER")
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
