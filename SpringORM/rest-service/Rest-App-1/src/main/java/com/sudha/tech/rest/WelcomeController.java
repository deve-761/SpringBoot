package com.sudha.tech.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String respPayload = "Welcome To Sudha Real Time";
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String respPayload = "Good Morning";
		return respPayload;
	}
	
	@GetMapping("/welcomeMsg")
	public ResponseEntity<String> getWelcomeMsgText(@RequestParam("name") String name) {
		String respPayload = name + ", Welcome To Sudha Real Time";
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}
}
