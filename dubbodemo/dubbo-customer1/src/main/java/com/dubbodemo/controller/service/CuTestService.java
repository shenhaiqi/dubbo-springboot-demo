package com.dubbodemo.controller.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbodemo.entity.User;
import com.dubbodemo.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by 123 on 2018/6/22.
 */
@Service
public class CuTestService {
    @Reference
    private TestService testService;

    public String hello() {
        return testService.sayHello("Hello springboot and dubbo  1 !");
    }

    public User user() {
        return testService.findUser();
    }
}
