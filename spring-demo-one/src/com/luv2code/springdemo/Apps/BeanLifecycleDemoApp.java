package com.luv2code.springdemo.Apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		//load app scope config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		Coach yourCoach = context.getBean("myCoach", Coach.class);
		
		// do something with the objects
		boolean result = (myCoach == yourCoach);
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory locatoin for myCoach: " + myCoach);
		
		System.out.println("\nMemory locatoin for yourCoach: " + yourCoach + "\n");

		//close context
		context.close();

	}

}
