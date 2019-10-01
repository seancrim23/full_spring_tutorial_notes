package com.luv2code.springdemo.fortuneservices;

import com.luv2code.springdemo.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "your day is going to be bad oops";
	}

}
