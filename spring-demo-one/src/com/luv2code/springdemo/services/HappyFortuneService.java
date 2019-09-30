package com.luv2code.springdemo.services;

import com.luv2code.springdemo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "hey you're going to have a great day!!!!";
	}

}
