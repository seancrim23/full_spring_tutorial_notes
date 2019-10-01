package com.luv2code.springdemo.fortuneservices;

import com.luv2code.springdemo.interfaces.FortuneService;

public class RadicalFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "hey dude your day is going to be super radical awesome";
	}

}
