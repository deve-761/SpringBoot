package com.realtech.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// HTTP GET Request
	// http://localhost:7272/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello SpringBoot Project World";
	}
}
