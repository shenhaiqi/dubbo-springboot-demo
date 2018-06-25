package com.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config/spring-dubbo.xml")
@EnableDubboConfiguration
public class Customer2Application {

	public static void main(String[] args) {
		SpringApplication.run(Customer2Application.class, args);
	}
}
