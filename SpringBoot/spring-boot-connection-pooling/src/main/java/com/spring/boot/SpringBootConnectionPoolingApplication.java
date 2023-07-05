package com.spring.boot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootConnectionPoolingApplication implements CommandLineRunner{
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConnectionPoolingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Connection Pooling : "+dataSource);
		
	}

}
