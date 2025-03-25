package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController {
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Welcome "+request.getSession().getId();
	}
}
