package com.luv2code.springdemo.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coaches.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close context
		context.close();
	}

}
