package com.spring.mvc.controller;


import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.command.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserController extends SimpleFormController{

	protected ModelAndView onSubmit(Object command) throws Exception{
		User user = (User) command;
		return new ModelAndView("registrationdetails","user",user);
	}
}
