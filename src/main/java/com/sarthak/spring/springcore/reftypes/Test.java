package com.sarthak.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/reftypes/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		//Student [scores=Scores [maths=80.0, physics=90.0, chemistry=78.0]]

	}

}
