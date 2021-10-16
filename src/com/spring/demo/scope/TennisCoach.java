package com.spring.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// define prototype scope
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
