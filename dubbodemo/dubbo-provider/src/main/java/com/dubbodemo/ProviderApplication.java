package com.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


@ImportResource({"classpath:config/spring-dubbo.xml"})
@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
