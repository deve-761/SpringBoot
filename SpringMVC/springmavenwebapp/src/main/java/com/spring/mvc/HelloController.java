package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/hellopage")
	public String helloPage() {
		return "helloform";
	}

	@RequestMapping("/wish")
	public String wish(@RequestParam("username") String username, ModelMap map) {
		map.addAttribute("message", "Hello " + username + "!");
		return "wish";
	}
}
