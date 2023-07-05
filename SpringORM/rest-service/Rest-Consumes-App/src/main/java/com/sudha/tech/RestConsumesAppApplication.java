package com.sudha.tech;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestConsumesAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestConsumesAppApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "5656"));
        app.run(args);
	}

}
