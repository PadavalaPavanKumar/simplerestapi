package com.simplerestapi.courseapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@GetMapping("/home")
	public String home() {
		
		
		return "this is my home page of home";

	}
}
