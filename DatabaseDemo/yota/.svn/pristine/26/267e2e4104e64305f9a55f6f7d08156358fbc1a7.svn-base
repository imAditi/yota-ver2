package com.yash.yota.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.yota.command.UserRegistrationCommand;
import com.yash.yota.domain.User;
import com.yash.yota.service.EmailService;
import com.yash.yota.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	EmailService emailService;
	
	@PostMapping("/trainer/register")
	public ResponseEntity<?> registerUserByTrainer(@RequestBody UserRegistrationCommand detailList) {
		List<User> registeredUsers = new ArrayList<>();
		for (String userString : detailList.getDetails()) {
			String[] details = userString.split(",");
			User user = new User();
			user.setFirstName(details[0]);
			user.setLastName(details[1]);
			user.setEmail(details[2]);
			user = userService.register(user);
			registeredUsers.add(user);
		}
		return new ResponseEntity<List<User>>(registeredUsers, HttpStatus.OK);
	}
	@PostMapping("/trainer/email")
	public ResponseEntity<?> sendEmailToRegisteredUsers(@RequestBody List<User> users){
		for (User user : users) {
			emailService.sendSimpleMessage(user);
		}
		return new ResponseEntity<String>("Registration successful",HttpStatus.OK);
	}
}
