package com.increff.training.employee.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.increff.employee.model.StringData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {

	@ApiOperation(value = "Say hello")
	@RequestMapping(value = "/say-hello", method = RequestMethod.GET)
	public StringData sayHello() {
		return new StringData("Hello world");
	}
}
