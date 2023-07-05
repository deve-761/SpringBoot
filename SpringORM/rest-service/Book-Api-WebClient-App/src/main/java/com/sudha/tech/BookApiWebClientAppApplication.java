package com.sudha.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sudha.tech.client.BookClient;

@SpringBootApplication
public class BookApiWebClientAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookApiWebClientAppApplication.class, args);
		BookClient bean = context.getBean(BookClient.class);
		//bean.invokeSaveBook();
		//bean.invokeGetBooks();
		bean.invokeGetBooksAsync();
	}

}
