package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.javaspringconfig.PizzaConfig;

public class PizzaJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
		
		Coach myPizzaCoach = context.getBean("pizzaCoach", Coach.class);
		
		System.out.println(myPizzaCoach.getDailyWorkout());
		System.out.println(myPizzaCoach.getDailyFortune());
		
		context.close();
		
	}

}
