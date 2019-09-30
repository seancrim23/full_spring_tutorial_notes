package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "30 minutes in the batting cage :)";
	}

	@Override
	public String getDailyFortune() {
		//use the fortune service to give the fortune!
		//coach gets workout on their own but gets the helper to get the fortune
		return fortuneService.getFortune();
	}
	
}
