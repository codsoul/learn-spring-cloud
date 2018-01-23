package com.latte.spring.cloud.eureka.demo.springcloudeurekademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/home")
	public String home(@RequestParam String userName) {
		return "Hi, " + userName + " This is Home Page, port:" + port;
	}
}
