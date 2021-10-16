package com.spring.demo.component.defaultBeanId;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// NOTE: @Component - Default Bean ID

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("defaultBeanId-applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
	}

}
