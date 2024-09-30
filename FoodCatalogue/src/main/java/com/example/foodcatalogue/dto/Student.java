package com.example.foodcatalogue.dto;

public class Student {
	
	int rollNo;
	String name;
	String subject;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, String subject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + "]";
	}
	

}
