package com.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbodemo.controller.service.CuTestService;
import com.dubbodemo.entity.User;
import com.dubbodemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by shq on 2018/6/21.
 */
@RestController
@RequestMapping("/customer1/")
public class TestController {

    @Resource
    private CuTestService cuTestService;

    @GetMapping("hello")
    public String hello() {
        return cuTestService.hello();
    }

    @GetMapping("user")
    public User user() {
        return cuTestService.user();
    }
}

