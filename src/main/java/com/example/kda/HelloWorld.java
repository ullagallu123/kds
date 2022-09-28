package com.example.kda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String hello() {
		return "<h1>Hello World!</h1>";
	}
	@RequestMapping("/devops")
	public String devops() {
		return "<h1>Welcome To DevOps!</h1>";
	}

}
