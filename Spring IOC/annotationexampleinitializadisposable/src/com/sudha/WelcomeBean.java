package com.sudha;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WelcomeBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage()");
	}

	public String sayHello() {
		return message;
	}


	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("preDestroy Method");
	}


	@PostConstruct
	public void init() throws Exception {
		System.out.println("postconstruct()");
	}

}
