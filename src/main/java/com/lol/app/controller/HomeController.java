package com.lol.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String test() {
		System.out.println("home");
		return "home";
	}
	
	
	
	
}
