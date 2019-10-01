package com.luv2code.springdemo.coaches;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 1000 laps!!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
