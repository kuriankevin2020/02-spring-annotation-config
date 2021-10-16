package com.spring.defaultBeanId;

import org.springframework.stereotype.Component;

// default bean id
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

}
