package com.increff.training.employee.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class RestappConfig extends WebMvcConfigurerAdapter {

	public static final String PACKAGE_CONTROLLER = "com.increff.training.employee.controller";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)//
				.useDefaultResponseMessages(false)//
				.select().apis(RequestHandlerSelectors.basePackage(PACKAGE_CONTROLLER))//
				.paths(PathSelectors.regex("/api/.*"))//
				.build();
	}

	// Add configuration for Swagger
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
