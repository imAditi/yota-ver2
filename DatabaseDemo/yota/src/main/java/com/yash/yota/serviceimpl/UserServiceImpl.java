package com.yash.yota.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.yota.domain.Role;
import com.yash.yota.domain.Status;

import com.yash.yota.command.LoginCommand;
import com.yash.yota.domain.User;
import com.yash.yota.exception.InvalidLoginNameAndPassword;
import com.yash.yota.repository.UserRepository;
import com.yash.yota.service.RoleService;
import com.yash.yota.service.StatusService;
import com.yash.yota.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	StatusService statusService;
	
	@Autowired
	RoleService roleService;
	
	@Override
	public User authenticate(LoginCommand loginCommand) throws InvalidLoginNameAndPassword {
		User user=userRepository.findByLoginname(loginCommand.getLoginName());
		if(loginCommand.getPassword().equals(user.getPassword())) {
			return user;
		}else {
			throw new InvalidLoginNameAndPassword("Invalid Loginname and Passwprd");
		}
		
	}

	@Override
	public User register(User user) {
		Status status = statusService.findById(1l);
		user.setStatus(status);
		Role role = roleService.findById(3l);
		user.setRole(role);
		user.setLoginname(generateLoginName(user));
		user.setPassword(generatePassword(user));
		return userRepository.save(user);
	}
	
	private String generatePassword(User user) {

		return user.getLoginname()+"@123";
	}

	private String generateLoginName(User user) {
		return user.getFirstName()+user.getLastName().substring(0, 3);
		
	}

}
