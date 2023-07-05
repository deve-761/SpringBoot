package com.sudha;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		HelloBean bean = (HelloBean) context.getBean("hello");
		System.out.println(bean.wish());
		context.start();
		context.refresh();
		context.stop();
		context.close();
	}
}
