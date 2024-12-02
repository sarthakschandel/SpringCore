package com.sarthak.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarthak/spring/springcore/map/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		// Customer [id=20, products={100=IPhone, 200=IPad, 300=Macbook Pro, 400=Macbook
		// AIR}]
	}

}
