package com.luv2code.springdemo.fortuneservices;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Fortune pulled from a rest call :)";
	}

}
