package com.sudha;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		employee.getEmployeeDetails();
		EmployeeValidator validator = (EmployeeValidator) ctx.getBean("empValidator");
		Map<String, String> map = new HashMap<>();
		MapBindingResult results = new MapBindingResult(map, "com.sudha.Employee");
		validator.validate(employee, results);
		List<ObjectError> allErrors = results.getAllErrors();
		for (ObjectError e : allErrors) {
			System.out.println(e.getDefaultMessage());
		}
	}
}
