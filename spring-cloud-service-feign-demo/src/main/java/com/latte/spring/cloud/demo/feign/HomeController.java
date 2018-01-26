package com.latte.spring.cloud.demo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;
    
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return homeService.tohome(name);
    }
}