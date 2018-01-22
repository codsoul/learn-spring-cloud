package com.latte.spring.cloud.eureka.demo.springcloudeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDemoApplication.class, args);
	}
}
