package com.latte.spring.cloud.eureka.demo.springcloudeurekademo;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HomeService {
    @Override
    public String tohome(String name) {
        return "sorry "+name;
    }
}
