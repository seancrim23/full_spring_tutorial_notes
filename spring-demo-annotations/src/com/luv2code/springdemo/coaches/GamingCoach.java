package com.luv2code.springdemo.coaches;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;

@Component
public class GamingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "play halo 2 50 times";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
