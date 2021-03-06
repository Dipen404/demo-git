package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoGitApplication {
	
	@GetMapping("/home")
	public String showMessage() {
		return "Welcome to spring boot. This is just for demo purpose. This extra text is for new branch";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
	}

}
