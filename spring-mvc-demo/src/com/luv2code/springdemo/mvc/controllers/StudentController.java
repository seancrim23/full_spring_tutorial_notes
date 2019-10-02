package com.luv2code.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create new Student object
		Student student = new Student();
		//add student object as model attribute
		theModel.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		System.out.println("theCountry: " + theStudent.getCountry());
		return "student-confirmation";
	}
	
}
