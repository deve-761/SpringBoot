package com.sudha.tech.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudha.tech.props.AppProperties;

@RestController
public class DemoRestController {

	@Autowired
	private AppProperties props;

	@GetMapping("/welcome")
	public String welcomeMsgMethod() {
		return props.getMessages().get("welcomeMsg");
	}
	
	@GetMapping("/greet")
	public String greetMsgMethod() {
		return props.getMessages().get("greetMsg");
	}

	@GetMapping("/wish")
	public String wishMsgMethod() {
		return props.getMessages().get("wishMsg");
	}

}
