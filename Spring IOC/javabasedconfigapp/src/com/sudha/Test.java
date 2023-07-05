package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
		JavaBean javaBean = (JavaBean) context.getBean("javaBean");
		System.out.println(javaBean.getMessage());
	}
}
