package com.sudha;

public class WelcomeBean {

	public void init() {
		System.out.println("User Defined init() method");
	}

	public String sayWelcome() {
		return "Welcome Java spring";
	}

	public void destroy() {
		System.out.println("User defined destroy() method");
	}
}
