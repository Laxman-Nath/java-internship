package com.appsoft.commonutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailUtils {
	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String toEmail, String subject, String message) {
		SimpleMailMessage m = new SimpleMailMessage();
		m.setSubject(subject);
		m.setText(message);
		m.setTo(toEmail);
		mailSender.send(m);
	}
}
