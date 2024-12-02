package com.sarthak.spring.springcore.properties.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springcore/properties/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);//MyDAO [dbServer=sarthakserver]
	}
}
//the type of properties file is file only