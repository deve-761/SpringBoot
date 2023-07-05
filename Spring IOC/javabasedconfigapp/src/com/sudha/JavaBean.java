package com.sudha;

public class JavaBean {

	static {
		System.out.println("Bean Load....");
	}

	public JavaBean() {
		System.out.println("Bean Created....");
	}

	public String getMessage() {
		return "This is Java Based Coniguration";
	}
}
