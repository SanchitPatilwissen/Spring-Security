package com.example.demo.controllers;

import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController {
	List<Student> students;
	
	MyController(){
		students = List.of(new Student("Sanchit Patil", 22, 10, 6), new Student("Sunil Gavaskar", 12, 7, 71));
	}
	
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Welcome "+request.getSession().getId();
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
