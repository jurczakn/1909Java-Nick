package com.revature.service;

import com.revature.pojo.User;

public interface UserService {
	
	public User loginUser(String username, String password);
	
	public User getUserByUsername(String username);

}
