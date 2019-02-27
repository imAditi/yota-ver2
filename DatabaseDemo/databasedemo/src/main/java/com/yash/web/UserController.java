package com.yash.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.command.LoginCommand;
import com.yash.domain.Role;
import com.yash.domain.Status;
import com.yash.domain.User;
import com.yash.exception.UserNotExist;
import com.yash.service.EmailService;
import com.yash.service.MapValidationErrorService;
import com.yash.service.RoleService;
import com.yash.service.StatusService;
import com.yash.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private StatusService statusService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private EmailService emailService;
	
	@PostMapping("")
	public ResponseEntity<?> registerUser(@Valid @RequestBody User user,BindingResult result){
		
		
		ResponseEntity<?> errMap = mapValidationErrorService.mapValidationError(result);
		if(errMap != null) {
			return errMap;
		}
		Status status = statusService.show(1L).get();
		user.setStatus(status);
		Role role = roleService.show(3L).get();
		user.setRole(role);
		
		User returnedUser = userService.register(user);
		emailService.sendSimpleMessage(returnedUser);
		return new ResponseEntity<User>(returnedUser, HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginCommand loginCommand,HttpSession session){
		try {
		User user = userService.login(loginCommand.getEmail(), loginCommand.getPassword());
		session.setAttribute("currentUser", user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch (UserNotExist e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/{registrationcode}")
	public ResponseEntity<?> listOfUsersOfRegistrationNo(@PathVariable Long registrationcode,HttpSession session){
		
		return new ResponseEntity<Iterable<User>>(userService.list(registrationcode),HttpStatus.OK);
	}
	
	@PutMapping("")
	public ResponseEntity<?> updateUser(@Valid @RequestBody User user,BindingResult result){
	ResponseEntity<?> errMap = mapValidationErrorService.mapValidationError(result);
	if(errMap != null) {
		return errMap;
	}
	User returnedUser = userService.update(user);
	return new ResponseEntity<User>(returnedUser, HttpStatus.OK);
	}
	
	@PostMapping("/logout")
	public ResponseEntity<?> logOut(HttpSession session) {
		session.invalidate();
		return new ResponseEntity<User>(new User(),HttpStatus.OK);
		
	}
}
