package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.coaches.SwimCoach;
import com.luv2code.springdemo.javaspringconfig.SportConfig;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);
		//Coach gamerCoach = context.getBean("gamingCoach", Coach.class);
		
		//call method on a bean
		System.out.println("Coach 1: " + myCoach.getDailyWorkout());
		//System.out.println("Coach 2: " + gamerCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		
		//close context
		context.close();
		
	}

}
