package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pojo.User;

@Service
public class AuthService {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User validateUser(User user) {
		
		User validatedUser = userService.getUserByUsername(user.getUsername());
		
		if(validatedUser != null && validatedUser.getPassword().equals(user.getPassword())) {
			return validatedUser;
		}
		
		return null;
		
	}
	
}
