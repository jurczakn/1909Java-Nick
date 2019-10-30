package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.pojo.User;

@Component
public class UserDao {

	private static List<User> userRepo;
	
	public UserDao() {
		userRepo = new ArrayList<User>();
		userRepo.add(new User("bmoney", "uhhh", "Brian M"));
		userRepo.add(new User("me", "yes", "oh course"));
		userRepo.add(new User("JJ", "password", "Nick J"));
	}
	
	public User getUser(String username) {
		User ret = null;
		
		for(User u : this.userRepo) {
			if (u.getUsername().equals(username)) {
				ret = u;
			}
		}
		return ret;
	}
	
	public List<User> getAllUsers() {
		return this.userRepo;
	}
	
	public void saveUser(User user) {
		this.userRepo.add(user);
	}
	
}
