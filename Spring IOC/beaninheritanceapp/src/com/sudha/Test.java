package com.sudha;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		HiBean hiBean = (HiBean) context.getBean("hi");
		System.out.println(hiBean.sayHi());
		WelcomeBean welcome = (WelcomeBean) context.getBean("welcome");
		System.out.println(welcome.sayWelcome());
		context.registerShutdownHook();
	}
}
