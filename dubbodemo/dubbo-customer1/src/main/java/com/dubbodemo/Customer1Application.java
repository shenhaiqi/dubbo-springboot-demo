package com.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:config/spring-dubbo.xml"})
@SpringBootApplication
@EnableDubboConfiguration
public class Customer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Customer1Application.class, args);
	}
}
