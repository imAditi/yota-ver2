package com.yash.yota.service;


import com.yash.yota.command.LoginCommand;
import com.yash.yota.domain.User;
import com.yash.yota.exception.InvalidLoginNameAndPassword;


public interface UserService {
	/**
	 * 
	 * @param loginCommand consist of loginName and password
	 * @return user object of given loginName and password 
	 * 			if the loginName and password is invalid then it return Null object
	 * @throws InvalidLoginNameAndPassword 
	 */
	public User authenticate(LoginCommand loginCommand) throws InvalidLoginNameAndPassword;
	/**
	 * Allows user to register in the application
	 * @param User object that we want to register
	 * @return returns registered User object
	 */
	public User register(User user);
}
