package com.sudha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sudha/cfg/spring_bean.xml");
		HelloBean bean1 = (HelloBean) ctx.getBean("helloBean");
		HelloBean bean2 = (HelloBean) ctx.getBean("helloBean");
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1 == bean2);
		System.out.println(bean1.sayHello());
		System.out.println(bean2.sayHello());

		ThreadScope threadScope = (ThreadScope) ctx.getBean("threadScope");
		HelloBean bean3 = (HelloBean) threadScope.remove("helloBean");
		System.out.println(bean3);

		HelloBean bean4 = (HelloBean) ctx.getBean("helloBean");
		HelloBean bean5 = (HelloBean) ctx.getBean("helloBean");
		System.out.println(bean4);
		System.out.println(bean5);
		System.out.println(bean4 == bean5);
		System.out.println(bean4.sayHello());
		System.out.println(bean5.sayHello());
	}
}
