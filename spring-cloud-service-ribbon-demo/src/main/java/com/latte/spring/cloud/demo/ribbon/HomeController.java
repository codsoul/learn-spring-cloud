package com.latte.spring.cloud.demo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/home")
	public String home(@RequestParam String userName) {
		return homeService.hiService(userName);
	}
}
