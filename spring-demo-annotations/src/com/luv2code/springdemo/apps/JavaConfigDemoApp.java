package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.javaspringconfig.SportConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		//Coach gamerCoach = context.getBean("gamingCoach", Coach.class);
		
		//call method on a bean
		System.out.println("Coach 1: " + myCoach.getDailyWorkout());
		//System.out.println("Coach 2: " + gamerCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		//close context
		context.close();
		
	}

}
