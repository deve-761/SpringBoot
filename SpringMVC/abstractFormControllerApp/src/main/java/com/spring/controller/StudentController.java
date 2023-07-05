package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

import com.spring.command.Student;

public class StudentController extends AbstractFormController {

	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response,
			Object command, BindException exception) throws Exception {
		Student student = (Student) command;
		ModelAndView mav = new ModelAndView("registrationdetails", "student", student);
		return mav;
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException exception)
			throws Exception {
		return new ModelAndView("registrationform");
	}

}
