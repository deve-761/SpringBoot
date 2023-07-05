package com.sudha;

public class WelcomeBean {

	private String wishMessage;
	private String name;

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
		System.out.println("WelcomeBean Initialization");
	}

	public void destroy() {
		System.out.println("welcomeBean Destruction");
	}

	public String sayWelcome() {
		return wishMessage + name;
	}

}
