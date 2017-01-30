package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientDemoApplication {

	@Value("${devguide.greeting}")
	private String greeting;


	public static void main(String[] args) {
		SpringApplication.run(ConfigClientDemoApplication.class, args);
	}

	@RequestMapping("/")
	public String account(){
		return greeting;
	}

	@RequestMapping("/test")
	public String teste(){
		return "test";
	}
}
