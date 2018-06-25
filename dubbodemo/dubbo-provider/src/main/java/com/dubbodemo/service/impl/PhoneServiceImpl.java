package com.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbodemo.entity.Phone;
import com.dubbodemo.service.PhoneServie;
import com.fasterxml.jackson.core.type.WritableTypeId;

/**
 * Created by 123 on 2018/6/25.
 */
@Service(interfaceClass = PhoneServie.class)
public class PhoneServiceImpl implements PhoneServie{
    @Override
    public Phone queryPhone() {
        return new Phone(8888,"APPLE","富士康");
    }

    @Override
    public Phone productHUAWEI() {
        return new Phone(6666,"HUAWEI","鸿海");
    }
}
