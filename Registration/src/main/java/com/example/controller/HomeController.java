package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.serviceI.ServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController

public class HomeController {

	@Autowired
	ServiceI hs;
	/*
	 * @RequestMapping(value = "/register",method = RequestMethod.POST) public
	 * String registerdata(@RequestBody Student s) { System.out.println("hiiii");
	 * hs.savedata(s);
	 * 
	 * 
	 * ObjectMapper obj = new ObjectMapper(); String s1=obj.writeValueAsString(s);
	 * return s1;
	 * 
	 * return "data"; }
	 */
	
	@RequestMapping(value ="/register",method = RequestMethod.POST)
	public String registerdata(@RequestBody Student s)
	{
		System.out.println("daya");
		hs.savedata(s);
		return "data";
	}
}
