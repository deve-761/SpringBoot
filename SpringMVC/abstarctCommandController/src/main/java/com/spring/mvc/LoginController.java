package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class LoginController extends AbstractCommandController{

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException exception)
			throws Exception {
		User user = (User) command;
		String uname = user.getUname();
		String upwd = user.getUpwd();
		ModelAndView mav = null;
		if (uname.equals("sudha") && upwd.equals("sudha")) {
			mav = new ModelAndView("status", "message", "User Login Success");
		} else {
			mav = new ModelAndView("status", "message", "User Login Failure");
		}
		return mav;
	}


}
