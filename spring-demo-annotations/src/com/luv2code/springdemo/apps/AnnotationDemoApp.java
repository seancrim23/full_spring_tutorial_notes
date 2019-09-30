package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach gamerCoach = context.getBean("gamingCoach", Coach.class);
		
		//call method on a bean
		System.out.println("Coach 1: " + myCoach.getDailyWorkout());
		System.out.println("Coach 2: " + gamerCoach.getDailyWorkout());
		
		//close context
		context.close();
		
	}

}
