package com.luv2code.springdemo.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coaches.FencingCoach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load app scope config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		//Coach myCoach = context.getBean("myCoach", Coach.class);
		
		//Coach yourCoach = context.getBean("myCoach", Coach.class);
		FencingCoach myFencingCoach = context.getBean("coolFencingCoach", FencingCoach.class);
		
		FencingCoach otherFencingCoach = context.getBean("coolFencingCoach", FencingCoach.class);
		
		// do something with the objects
		boolean result = (myFencingCoach == otherFencingCoach);
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory locatoin for myCoach: " + myFencingCoach);
		
		System.out.println("\nMemory locatoin for yourCoach: " + otherFencingCoach + "\n");

		//close context
		context.close();

	}

}
