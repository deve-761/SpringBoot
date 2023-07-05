package com.sudha;

public class HiBean {

	private String wishMessage;
	private String name;

	public String sayHi() {
		return wishMessage + name;
	}

	protected String getWishMessage() {
		return wishMessage;
	}

	protected void setWishMessage(String wishMessage) {
		this.wishMessage = wishMessage;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("hiBean Initialization");
	}

	public void destroy() {
		System.out.println("hiBean Destruction");
	}

}
