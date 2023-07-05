package com.sudha;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBean {

	private MessageSource messageResource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageResource = messageSource;
	}

	public void displayMessage() {
		System.out.println(
				"Message :" + messageResource.getMessage("welcome", new Object[] { "fr", "FR" }, Locale.FRANCE));
		System.out.println("Message :" + messageResource.getMessage("welcome", new Object[] { "en", "US" }, Locale.US));
	}
}
