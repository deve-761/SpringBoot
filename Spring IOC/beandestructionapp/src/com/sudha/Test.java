package com.sudha;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		WelcomeBean welcomeBean = (WelcomeBean) context.getBean("welcome");
		System.out.println(welcomeBean.sayWelcome());
		context.registerShutdownHook();
	}
}
