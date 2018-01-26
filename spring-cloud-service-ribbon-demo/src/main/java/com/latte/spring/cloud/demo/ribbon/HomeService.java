package com.latte.spring.cloud.demo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

	@Autowired
	private RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForObject("http://EUREKA-DEMO-CLIENT/home?userName=" + name, String.class);
	}
}
