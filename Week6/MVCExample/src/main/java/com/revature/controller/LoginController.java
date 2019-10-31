package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String loginGet(HttpSession sess, ModelMap modelMap) {
		
		if (sess.getAttribute("user") != null) {
			modelMap.addAttribute("user", sess.getAttribute("user"));
			return "home";
		}
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPost(User user, ModelMap modelMap, HttpSession sess) {
		System.out.println(user);
		
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
			return "home";
		}
		
		return "login";
	}

}
