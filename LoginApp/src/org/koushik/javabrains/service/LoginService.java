package org.koushik.javabrains.service;

import java.util.HashMap;

import org.koushik.javabrains.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		
		users.put("johndoe", "John DOE");
		users.put("janedoe", "Jane DOE");
		users.put("jguru", "Java GURU");
	}
	
	public boolean authenticate(String userId, String password) {
		
		if (password == null || password.trim() == "") {
			
			return false;
		}
		
		return true;
	}
	
	public User getUserDetails(String userId) {
		
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		
		return user;
	}
}
