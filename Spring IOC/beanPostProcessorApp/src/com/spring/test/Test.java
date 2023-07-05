package com.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Customer;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/cfg/spring_config.xml");
		Customer cust = (Customer) context.getBean("customer");
		cust.getCustomerData();
		context.registerShutdownHook();
	}
}
