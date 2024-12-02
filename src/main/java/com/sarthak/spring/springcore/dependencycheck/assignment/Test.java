package com.sarthak.spring.springcore.dependencycheck.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/dependencycheck/assignment/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);//Prescription [id=123, patientName=null, medicines=null]
		

	}

}
//without toString method O/P is
//com.sarthak.spring.springcore.dependencycheck.assignment.University@193f604a
//with toString method O/P is 
//University [id=123, name=null, location=null]