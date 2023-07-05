package com.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.command.User;

@Controller
@RequestMapping("/reg")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String showPage(Model model) {
		model.addAttribute("user", new User());
		return "registrationform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registration(@Valid User user, BindingResult errors, Model model) {
		model.addAttribute("user", user);
		if (errors.hasErrors()) {
			return new ModelAndView("registrationform", "user", user);
		} else {
			return new ModelAndView("registrationdetails", "user", user);
		}
	}
}
