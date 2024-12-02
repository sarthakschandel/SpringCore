package com.sarthak.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/lc/annotations/assignment/config.xml");
		TicketReservation tc = (TicketReservation) context.getBean("mybean");
		System.out.println(tc.getTicketID());
		System.out.println(tc.getName());
		context.registerShutdownHook();

	}
}
/*
 This is the init method
123
sarthak29
This is the destroy method
 */