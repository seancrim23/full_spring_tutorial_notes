package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("INSIDE setEmailAddress SETTER!");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("INSIDE setTeam SETTER!");
		this.team = team;
	}

	public CricketCoach() {}
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("INSIDE setFortuneService SETTER!");
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes!!!!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
