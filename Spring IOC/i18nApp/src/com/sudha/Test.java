package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sudha/resources/spring_bean.xml");
		I18NBean bean = (I18NBean) context.getBean("i18nBean");
		bean.displayMessage();
	}
}
