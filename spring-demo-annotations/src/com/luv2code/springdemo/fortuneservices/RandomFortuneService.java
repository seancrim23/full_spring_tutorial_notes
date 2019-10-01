package com.luv2code.springdemo.fortuneservices;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Random Fortune :)";
	}

}
