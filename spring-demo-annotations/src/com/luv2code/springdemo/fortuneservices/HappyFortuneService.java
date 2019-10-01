package com.luv2code.springdemo.fortuneservices;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "You're going to have a great day :)";
	}

}
