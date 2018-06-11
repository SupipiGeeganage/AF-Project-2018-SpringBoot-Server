package com.afproject.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.afproject.app.user.model.Users;
import com.afproject.app.user.repository.UserRepository;


public class UserService {
	
	@Autowired
	private UserRepository URepository;
	
	public Users loginUser(String Username, String Password) {
		Users user = this.findUser(Username);
		if(user != null && user.getPassword().equals(Password)) {
			return user;
		}
		
		return null;
	}

	private Users findUser(String username) {
		
		return URepository.findUserByName(username);
	}

}
