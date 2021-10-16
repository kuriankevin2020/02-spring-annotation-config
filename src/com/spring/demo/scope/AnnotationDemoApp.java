package com.spring.demo.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// NOTE: @Scope

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("scope-applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same object: " + result);
		
		System.out.println("Memory location for theCoach" + theCoach);
		System.out.println("Memory location for alphaCoach" + alphaCoach);
		
		// close the context
		context.close();
		
	}

}
