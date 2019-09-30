package com.luv2code.springdemo.Apps;

import com.luv2code.springdemo.coaches.TrackCoach;
import com.luv2code.springdemo.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {

		//create the object
		Coach baseballCoach = new TrackCoach();
		
		//use the object
		System.out.println(baseballCoach.getDailyWorkout());
		
	}

}
