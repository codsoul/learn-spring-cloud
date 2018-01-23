package com.latte.spring.cloud.eureka.demo.springcloudeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientDemoApplication.class, args);
	}
}
