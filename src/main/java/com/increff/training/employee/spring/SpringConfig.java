package com.increff.training.employee.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.increff.training.employee" })
public class SpringConfig {
	
	@Bean
	public String hello() {
		System.out.println("***************");
		return null;
	}

}
