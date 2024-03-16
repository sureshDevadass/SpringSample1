package com.example.SpringSample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSample1Application {
	@GetMapping("/message")
	String get(){
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSample1Application.class, args);
	}

}
