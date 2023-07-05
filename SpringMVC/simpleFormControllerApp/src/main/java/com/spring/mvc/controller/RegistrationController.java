package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.command.User;

public class RegistrationController extends SimpleFormController {

	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<>();

		List<String> qual_List = new ArrayList<>();
		qual_List.add("BSC");
		qual_List.add("B.Tech");
		qual_List.add("MCA");
		qual_List.add("MTech");
		qual_List.add("PHD");
		map.put("qual_List", qual_List);

		List<String> uworkLocation = new ArrayList<>();
		uworkLocation.add("Banglore");
		uworkLocation.add("Hyderabad");
		uworkLocation.add("Chennai");
		uworkLocation.add("Mumbai");
		map.put("uworkLocation", uworkLocation);

		Map<String, Object> uhobbies = new HashMap<>();
		uhobbies.put("Cricket", "Playing Cricket");
		uhobbies.put("Music", "Listening Music");
		uhobbies.put("Browse", "Mobile Browsing");
		map.put("uhobbies", uhobbies);

		Map<String, Object> uprofession = new HashMap<>();
		uprofession.put("Former", "Former");
		uprofession.put("Employee", "Employee");
		uprofession.put("Teacher", "Teacher");
		map.put("uprofession", uprofession);

		return map;
	}

	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User) command;
		return new ModelAndView("status", "user", user);
	}
}
