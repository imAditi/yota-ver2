package com.yash.yota.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yash.yota.domain.User;



@Service
public class EmailService {

	@Autowired
	public JavaMailSender emailSender;

	public void sendSimpleMessage(User user) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setSubject("Your OTA login credentials");
		message.setText("Hey "+user.getFirstName()+" , "+"\nBelow mentioned are your credentials to login OTA for registration code : "+user.getRegistrationCode()+"\nlogin name: " + user.getLoginname() + "\nPassword: " + user.getPassword()+"\n\nThankyou");
		emailSender.send(message);

	}
}
