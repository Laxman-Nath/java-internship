package com.springbootmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootmvc.models.Student;
import com.springbootmvc.repositry.StudentRepositry;

@Controller
public class LoginController {
	@Autowired
	private StudentRepositry studentRepositry;

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String postLogin(@ModelAttribute Student student, Model m) {
		
		student.setPassword(DigestUtils.md5DigestAsHex(student.getPassword().getBytes()));
		Student st = this.studentRepositry.getStudent(student.getName(), student.getPassword());
		if (st != null) {
			m.addAttribute("name", student.getName());
			return "home";
		}
		m.addAttribute("error", "Login failed!");
		return "login";

	}
	
	

}
