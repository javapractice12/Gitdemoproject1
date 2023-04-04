package com.example.demo.Spring.Demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Logincontroller {
	/*@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginpage(){
		return "login";}
	@RequestMapping(value="/institute",method=RequestMethod.GET)
	public String Registerform(){
		return "institute";}*/
	@RequestMapping(value="/first")
	public String firstpage() {
		return "first";
	}
	@RequestMapping(value="/institute")
	public String inst() {
		return "institute";
	}
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	//@component scan
	//@embeded configuration
	//@configuration
	
	

}
