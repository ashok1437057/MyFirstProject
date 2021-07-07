package com.ashok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String welcome() {
		return "Hi ashok welcome to spring boot";
		
	}
	@GetMapping("/sayHi")
	public String welcome2() {
		return "Hi ashok welcome to java development environment";
		
	}
}
