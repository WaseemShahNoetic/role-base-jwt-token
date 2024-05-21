package com.springBootJWTtoken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping({ "/hello" })
	public String firstPage() {
		return "Your UserName and Password was Successfully Work !";
	}

}