package com.spring.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@org.springframework.stereotype.Controller
@SessionAttributes("status")
public class LoginController {

	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginform";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, ModelMap map)
			throws Exception {
		String status = "";
		if (uname.equals("sudha") && upwd.equals("sudha")) {
			map.addAttribute("status", "Login Success");
		} else {
			map.addAttribute("status", "Login Failure");
		}
		return "status";
	}

}
