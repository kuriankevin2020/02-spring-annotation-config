package com.spring.demo.autowired.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// NOTE: @Autowired - Setter Injection

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("setterInjection-applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
