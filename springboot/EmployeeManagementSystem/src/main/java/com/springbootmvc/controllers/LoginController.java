package com.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.springbootmvc.models.Student;
@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
}
