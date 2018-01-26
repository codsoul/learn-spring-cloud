package com.latte.spring.cloud.demo.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HomeService {
    @Override
    public String tohome(String name) {
        return "sorry "+name;
    }
}
