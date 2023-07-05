package com.sudha;

public class HelloBean {

	public HelloBean() {
		System.out.println("HelloBean object created");
	}

	public String sayHello() {
		return "Hello User from " + Thread.currentThread().getName() + " Scope";
	}
}
