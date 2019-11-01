package com.revature.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
	public String loginPost(@Valid User user, BindingResult bindingResult, ModelMap modelMap, HttpSession sess) {
		System.out.println(user);
		
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
			System.out.println(bindingResult.getAllErrors().get(0).getDefaultMessage());
			return "login";
		}
		
		User authUser = authService.validateUser(user);
		
		if (authUser != null) {
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
			return "home";
		}
		
		modelMap.addAttribute("errorMessage", "Username/Password did not match");
		
		return "login";
	}

}
