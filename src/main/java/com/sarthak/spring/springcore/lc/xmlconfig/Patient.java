package com.sarthak.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside Hi Method");//init method
	}
	
	public void bye(){
		System.out.println("Inside Bye Method");//destroy method
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
