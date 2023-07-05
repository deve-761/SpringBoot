package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String showLoginPage() {
		return "loginform";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd) {
		String status = "";
		if (uname.equals("Sudhakar") && upwd.equals("Sudhakar")) {
			status = "success";
		} else {
			status = "failure";
		}
		System.out.println("Status :" + status);
		return status;
	}
}
