package com.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbodemo.entity.User;
import com.dubbodemo.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shq on 2018/6/21.
 */
@RestController
@RequestMapping("/customer2/")
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }
}

