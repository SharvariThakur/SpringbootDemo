package com.spring.boot.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("Home")
public class SpringBootDemoApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootDemoApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}


	@GetMapping("/info")
	public String getInfo(){

		return "Welcome to home screen";
	}
//C:\Users\Administrator\.jdks\openjdk-23.0.1
}
