package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cfg/spring_bean.xml");
		Course course = (Course) context.getBean("course");
		course.getCourseDetails();
	}
}
