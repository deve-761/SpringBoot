package com.spring.mvc;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		String message = "";
		if (hour < 12) {
			message = "Good Morning";
		} else if (hour < 17) {
			message = "Good Afternoon";
		} else {
			message = "Good Evening";
		}
		return new ModelAndView("wish", "message", message);
	}

}
