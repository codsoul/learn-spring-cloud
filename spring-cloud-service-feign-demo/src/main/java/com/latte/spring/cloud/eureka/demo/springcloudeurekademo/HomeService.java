package com.latte.spring.cloud.eureka.demo.springcloudeurekademo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-demo-client", fallback = SchedualServiceHiHystric.class)
public interface HomeService {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String tohome(@RequestParam(value = "userName") String name);
}
