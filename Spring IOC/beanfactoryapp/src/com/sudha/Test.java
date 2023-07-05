package com.sudha;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) throws Exception {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sudha/cfg/spring_bean.xml"));
		HiBean bean = (HiBean) factory.getBean("hi");
		System.out.println(bean.sayHi());
	}
}
