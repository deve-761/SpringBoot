package com.sudha;

public class HelloBean {

	private String message;

	public String hello() {
		return "Hello " + message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
