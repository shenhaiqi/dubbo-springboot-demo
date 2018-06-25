package com.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbodemo.entity.Phone;
import com.dubbodemo.service.PhoneServie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123 on 2018/6/25.
 */
@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Reference
    PhoneServie phoneServie;

    @RequestMapping("iphone")
    public Phone getIphone(){
       return  phoneServie.queryPhone();
    }

    @RequestMapping("huawei")
    public Phone getHUAWEI(){
       return  phoneServie.productHUAWEI();
    }
}
