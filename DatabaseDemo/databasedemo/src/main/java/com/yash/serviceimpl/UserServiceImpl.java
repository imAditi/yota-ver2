package com.yash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.domain.User;
import com.yash.exception.UserNotExist;
import com.yash.repository.UserRepository;
import com.yash.service.StatusService;
import com.yash.service.UserService;

import ch.qos.logback.core.status.Status;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;	
	
	@Override
	public User register(User user) {
		createLoginNameAndPassword(user);
		return userRepository.save(user);
	}

	private void createLoginNameAndPassword(User user) {
		String loginName = user.getFirstName();
		int count = 0;
		char[] arr = user.getLastName().toCharArray();
		for(int i = 0; i < arr.length; ++i ) {
			if(count < 3) {
				loginName = loginName + String.valueOf(arr[i]);
				++count;
			}
		}
		user.setLoginname(loginName);
		user.setPassword(loginName+"@123");
	}

	@Override
	public void delete(Long id) {
		
		userRepository.deleteById(id);
	}

	@Override
	public User login(String email, String password) throws UserNotExist {

		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return user;
		}
		else {
			throw new UserNotExist("User not exist");
		}
		
	}

	@Override
	public User update(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Iterable<User> list(Long registrationcode) {
		
		return userRepository.findByRegistrationCode(registrationcode);
	}

}
