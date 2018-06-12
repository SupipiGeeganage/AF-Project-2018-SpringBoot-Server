package com.afproject.app.user.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afproject.app.user.model.Users;
import com.afproject.app.user.service.UserService;



@RestController
@RequestMapping("/")
public class UserLoginController {
	
	private UserService UService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm(){
		return "loging";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verifyLogin(@RequestParam String userid,@RequestParam String password){
		Users user = UService.loginUser(userid, password);
		if(user == null) {
			return "loging";
		}
		return "redirect:/";
	}
}
