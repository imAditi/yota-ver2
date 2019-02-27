package com.yash.yota.service;

import org.springframework.stereotype.Service;


import com.yash.yota.domain.User;
import com.yash.yota.exception.UserNotExist;


@Service
public interface UserService {

	public void delete(Long id);
	
	public User login(String email, String password) throws UserNotExist;
	
	public User update(User user);
	
	public Iterable<User> list(Long registrationcode);

	User register(User user);
}
