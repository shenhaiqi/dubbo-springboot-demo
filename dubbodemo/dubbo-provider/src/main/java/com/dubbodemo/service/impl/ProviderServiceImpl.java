package com.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbodemo.entity.User;
import com.dubbodemo.service.TestService;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by shq on 2018/6/21.
 */
@Service(interfaceClass = TestService.class)   //注意此处的Service 是dubbo 的
//@Component
public class ProviderServiceImpl implements TestService {
    @Override
    public String sayHello(String str) {
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = stf.format(System.currentTimeMillis());
        return format+str;
    }

   @Override
    public User findUser() {
        User user =  new User();
        user.setId(123);
        user.setAge(108);
        user.setGender(1);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        return user;
    }

    public String eat(String food){
        return "吃了一些"+food;
    }
}
