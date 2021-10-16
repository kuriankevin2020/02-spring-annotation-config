package com.spring.customBeanId;

import org.springframework.stereotype.Component;

// custom bean id
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

}
