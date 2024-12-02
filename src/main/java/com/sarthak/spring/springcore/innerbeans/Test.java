package com.sarthak.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.hashCode());//1716093734
		System.out.println(employee);
		//Employee [id=123, address=Address [hno=700, street=Mira Mesa Blvd, city=San Diego]]
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2.hashCode());//212683148
		System.out.println(employee2);
		///Employee [id=123, address=Address [hno=700, street=Mira Mesa Blvd, city=San Diego]]
		
	}

}
