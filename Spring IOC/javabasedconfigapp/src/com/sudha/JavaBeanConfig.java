package com.sudha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanConfig {

	@Bean
	public JavaBean javaBean() {
		return new JavaBean();
	}
}
