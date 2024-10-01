package com.springbootmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootmvc.Repository.EmployeeRepository;
import com.springbootmvc.models.Employee;

@Controller
public class RegisterController {
	@Autowired
	private EmployeeRepository employeeRepositry;
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}

	@PostMapping("/postRegister")
	public String postRegister(@ModelAttribute Employee employee,Model m) {
		employee.setPassword(DigestUtils.md5DigestAsHex(employee.getPassword().getBytes()));
		Employee emp=this.employeeRepositry.save(employee);
		if(emp!=null) {
			m.addAttribute("success","Added successfully!");
		}
      
		return "register";
	}
}
