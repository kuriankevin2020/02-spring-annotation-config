package com.spring.demo.initAndDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// NOTE: @PostConstruct and @PreDestroy

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"initAndDestroy-applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
