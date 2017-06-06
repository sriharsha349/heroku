package com.harsha.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class SpringHelloApplication {
	@RequestMapping("/")
	@ResponseBody
	String home (){
		return "Hello world";
}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}
}
