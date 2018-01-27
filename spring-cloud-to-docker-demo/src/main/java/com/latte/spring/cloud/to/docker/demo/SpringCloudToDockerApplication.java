package com.latte.spring.cloud.to.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class SpringCloudToDockerApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World." + "<br />Welcome ";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudToDockerApplication.class, args);
    }
}
