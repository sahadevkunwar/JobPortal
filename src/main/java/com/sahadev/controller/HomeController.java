package com.sahadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sahadev.Service.JobService;
import com.sahadev.Service.UserService;
import com.sahadev.entity.Job;
import com.sahadev.entity.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private JobService jobService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	 
	@GetMapping("/")
	public String openHome() {
		return "index";
	}
	
	  @PostMapping("/signup") 
	  public String createUser(@ModelAttribute User user) {
	  user.setPassword(passwordEncoder.encode(user.getPassword()));
	  userService.createUser(user); 
	  return "redirect:/login"; }
	    
	@GetMapping("/signup")
	public String openSingup() {
		return "createUser";
	}
	
	
	  @GetMapping("/login") 
	  public String loginPage() {
		  return "login"; 
		  }
	 
}
