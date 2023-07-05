package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		WelcomeBean welcomBean = (WelcomeBean) context.getBean("welcom");
		System.out.println(welcomBean.getMessage());
		((AbstractApplicationContext) context).registerShutdownHook();
		
	}
}
