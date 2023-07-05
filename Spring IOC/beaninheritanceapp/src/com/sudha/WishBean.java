package com.sudha;

public class WishBean {

	private String wishMessage;
	private String name;
	
	public void init() {
		System.out.println("wishBean Initialization");
	}

	public void destroy() {
		System.out.println("wishBean Destruction");
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

}
