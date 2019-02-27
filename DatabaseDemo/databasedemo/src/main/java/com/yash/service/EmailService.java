package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yash.domain.User;

@Service
public class EmailService {

	@Autowired
	public JavaMailSender emailSender;

	public void sendSimpleMessage(User user) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setSubject("Your OTA login credentials");
		message.setText("login name: " + user.getLoginname() + "\nPassword: " + user.getPassword());
		emailSender.send(message);

	}
}
