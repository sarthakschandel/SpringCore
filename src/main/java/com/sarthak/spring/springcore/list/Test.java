package com.sarthak.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/list/listconfig.xml");//provide full path as best practise
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println(hospital.getName());//Global Hospital
		System.out.println(hospital.getDepartments());//[Front Office, In Patient, Out Patient]
		System.out.println(hospital.getDepartments().getClass());//class java.util.ArrayList

	}

}
