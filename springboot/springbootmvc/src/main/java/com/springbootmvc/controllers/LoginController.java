package com.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootmvc.models.Student;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String postLogin(@ModelAttribute Student student,Model m) {
		if(student.getName().equals("laxman") && student.getPassword().equals("1234")) {
		 m.addAttribute("name",student.getName());
		 return "home";
		}
	    m.addAttribute("error","Login failed!");
		return "login";
	
	}

}
