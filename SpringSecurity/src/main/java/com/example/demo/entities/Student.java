package com.example.demo.entities;

public class Student {
	public Student(String name, int age, int division, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.division = division;
		this.rollno = rollno;
	}
	String name;
	int age;
	int division;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
