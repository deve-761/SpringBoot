package com.sudha.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sudha.tech.client.BookClient;

@SpringBootApplication
public class BookApiClientAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BookApiClientAppApplication.class, args);
		BookClient bean =  run.getBean(BookClient.class);
		//bean.invokeBookTicket();
		//bean.invokeGetBooks();
		bean.invokeGetBooksNew();
	}

}
