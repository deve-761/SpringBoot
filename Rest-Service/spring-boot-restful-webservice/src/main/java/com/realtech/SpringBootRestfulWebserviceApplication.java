package com.realtech;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Spring Boot API Documentation",
		             description = "Spring Boot REST API Documentation",
		             contact = @Contact(
		            		   name = "Sudhakar",
		            		   email = "Sudhakar@gmail.com",
		            		   url = "http://www.sudhakar.com"
		            		 ),
		             license = @License(
		            		 name = "Apache 2.0",
		            		 url = "http://www.sudhakar.com/user_management.html"
		            		 )
				),
		  externalDocs = @ExternalDocumentation(
				  description = "Spring Boot User Management Documentation",
				  url = "http://www.sudhakar.com/user_management.html"
				  )
		)
public class SpringBootRestfulWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulWebserviceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
