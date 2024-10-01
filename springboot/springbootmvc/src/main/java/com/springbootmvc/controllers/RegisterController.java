package com.springbootmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootmvc.models.Student;
import com.springbootmvc.repositry.StudentRepositry;

@Controller
public class RegisterController {
	@Autowired
	private StudentRepositry studentRepositry;
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	
	@PostMapping("/register")
	public String postRegister(@ModelAttribute Student student,Model m) {
		if (this.studentRepositry.existsByName(student.getName())) {
			m.addAttribute("duplicate", "User with similar name already exists!");
			return "register";
		}
		m.addAttribute("student",student);
		student.setPassword(DigestUtils.md5DigestAsHex(student.getPassword().getBytes()));
		Student st=this.studentRepositry.save(student);
		return "profile";
	}
}
