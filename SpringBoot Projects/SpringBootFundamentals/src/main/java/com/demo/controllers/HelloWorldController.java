package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//GET HTTP method
	// http://localhost:8089
	@GetMapping("/")
	public String message() {
		return "Welcome to Spring Boot Application";
	}
	
	// http://localhost:8089/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
