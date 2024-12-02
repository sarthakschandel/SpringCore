package com.sarthak.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/config.xml");//get the config file
		Employee emp = (Employee) ctx.getBean("emp");// to get the bean
		System.out.println("Employee ID: " + emp.getId());// Employee ID: 20
		System.out.println("Employee Name: " + emp.getName());// Employee Name: Sarthak

	}

}
//the config file specifies which way the DI will take place
//like value as element, value as attribute or p schema
//congig file is step2

//this test class is the step3, final step