package com.sarthak.spring.springcore;

public class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//this is the Employee bean
//POJO class step1
//every Java Bean is a POJO, but every POJO is not a Java Bean