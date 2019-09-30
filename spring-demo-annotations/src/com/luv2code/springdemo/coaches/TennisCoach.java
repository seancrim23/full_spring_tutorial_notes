package com.luv2code.springdemo.coaches;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Hit the tennis ball!!!!!";
	}

}
