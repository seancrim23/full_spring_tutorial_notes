package com.luv2code.springdemo.javaspringconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.coaches.PizzaCoach;
import com.luv2code.springdemo.fortuneservices.RadicalFortuneService;
import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

@Configuration
public class PizzaConfig {

	@Bean
	public FortuneService radicalFortuneService() {
		return new RadicalFortuneService();
	}
	
	@Bean
	public Coach pizzaCoach() {
		return new PizzaCoach(radicalFortuneService());
	}
	
}
