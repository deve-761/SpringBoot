package com.sudha;

public class HiBean {

	static {
		System.out.println("Bean loading.....");
	}

	public HiBean() {
		System.out.println("Bean created");
	}

	public String sayHi() {
		return "Hi Team";
	}

}
