package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization()");
		Customer customer = (Customer) bean;
		customer.setCmobile("9849795563");
		return customer;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		System.out.println("postProcessBeforeInitialization()");
		Customer customer = (Customer) bean;
		customer.setCemail("Sudha@gmail.com");
		return customer;
	}

}
