package com.luv2code.springdemo.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	// new controller method to read form data
	// and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String shoutOut(HttpServletRequest request, Model model) {
		
		// read the request parameter from the html form
		String theName = request.getParameter("studentName");
		//convert to all caps
		theName = theName.toUpperCase();
		//create message
		String result = "Yo " + theName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// new controller method to read form data
	// and add data to the model
	@RequestMapping("/processFormVersionThree")
	public String shoutOutVersionTwo(@RequestParam("studentName") String studentName, Model model) {
		
		//convert to all caps
		studentName = studentName.toUpperCase();
		//create message
		String result = "Whats up buddy (from v3) " + studentName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
