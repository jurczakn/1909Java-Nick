package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.pojo.User;
import com.revature.service.AuthService;

@Controller
public class LoginController {
	
	private AuthService authService;
	
	@Autowired
	public void setAuthService(AuthService authService) { 
		this.authService = authService;
	}
	
	@GetMapping("/login")
	public String loginGet() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPost(User user) {
		System.out.println(user);
		
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			return "home";
		}
		
		return "login";
	}

}
