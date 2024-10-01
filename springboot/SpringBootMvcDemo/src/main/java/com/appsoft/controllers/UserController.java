package com.appsoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.models.User;
import com.appsoft.services.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String getLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String postLogin(@RequestParam String name, @RequestParam String password, Model m) {

		if (this.userService.login(name, password)) {
			System.out.println(name);
			m.addAttribute("name", name);
//			m.addAttribute("message","this is my message");
			return "home";
		}
		m.addAttribute("error", "Login failed!");
		return "login";

	}
	@GetMapping("logout")
	public String logout() {
		return "login";
	}

	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}

	@PostMapping("/register")
	public String postRegister(@ModelAttribute User user, Model m
			,@RequestParam List<String> hobbies) {
		if (this.userService.isUserWithSameNameExists(user.getName())) {
			m.addAttribute("duplicate", "User with similar name already exists!");
			return "register";
		}
		user.setHobbiesString(hobbies.toString());
		if (this.userService.register(user) != null) {
			m.addAttribute("user", user);
			return "login";
		}
		m.addAttribute("Error", "Error registering!");
		return "/register";
	}
	
	
	

}
