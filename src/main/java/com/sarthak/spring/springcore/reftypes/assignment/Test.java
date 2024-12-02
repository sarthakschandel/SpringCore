package com.sarthak.spring.springcore.reftypes.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/reftypes/assignment/config.xml");// getting the config file for
																				// application context to work on
		ShoppingCart sc = (ShoppingCart) context.getBean("cart");// getting the bean and use it from Spring
		System.out.println(sc);// ShoppingCart [items=Item [id=123, name=myItem, quantity=25, price=1000.0]]
	}
}
