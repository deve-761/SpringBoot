package com.spring.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("status")
public class LoginController {

	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginform";
	}

	@RequestMapping("/login")
	public String checkLoginDetails(@RequestParam("username") String username,
			@RequestParam("password") String password, ModelMap map) throws Exception {
		String status = "";
		if (username.equals("sudha") && password.equals("sudha")) {
			map.put("status", "Login Success");
		} else {
			map.put("status", "Login Failure");
		}
		return "status";
	}
}
