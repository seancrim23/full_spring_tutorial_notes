package com.luv2code.springdemo.services;

import com.luv2code.springdemo.interfaces.FortuneService;

public class RandomFortuneService implements FortuneService {

	String[] fortunes = new String[] { "cool fortune 1", "cool fortune 2", "cool fortune 3"};
	
	@Override
	public String getFortune() {
		// generate a random index from 0 to 2
		int randomIndex = (int)(Math.random() * ((2 - 0) + 1) + 0);
		return fortunes[randomIndex];
	}

}
