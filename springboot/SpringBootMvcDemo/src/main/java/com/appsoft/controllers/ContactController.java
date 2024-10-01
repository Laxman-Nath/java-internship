package com.appsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.commonutils.EmailUtils;

@Controller

public class ContactController {

	@Autowired
	private EmailUtils emailUtils;

	@GetMapping("/contact")
	public String getContact() {
		return "contactform";
	}

	@PostMapping("/contact")
	public String sendEmail(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String message) {
		emailUtils.sendEmail(toEmail, subject, message);
		return "contactform";
	}
}
