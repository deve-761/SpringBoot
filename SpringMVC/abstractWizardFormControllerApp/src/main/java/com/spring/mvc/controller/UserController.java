package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.spring.mvc.command.User;

public class UserController extends AbstractWizardFormController {

	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException exception) throws Exception {
		User user = (User) command;
		return new ModelAndView("userdetails", "user", user);
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException exception) throws Exception {
		return new ModelAndView("welcomepage");
	}

}
