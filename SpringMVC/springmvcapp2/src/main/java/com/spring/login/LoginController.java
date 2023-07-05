package com.spring.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ModelAndView mav = null;
		if (username.equals("sudha") && password.equals("sudha")) {
			mav = new ModelAndView("success");
		} else {
			mav = new ModelAndView("failure");
		}
		return mav;
	}

}
