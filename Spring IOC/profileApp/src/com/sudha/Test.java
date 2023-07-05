package com.sudha;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "development");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("com/sudha/resource/applicationContext-development.xml",
				"com/sudha/resource/applicationContext-production.xml");
		context.refresh();
		Account bean = (Account) context.getBean("accBean");
		bean.listAccounts();
	}
}
