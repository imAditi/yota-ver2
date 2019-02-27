package com.yash.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.domain.Role;

import com.yash.service.RoleService;

@RestController
@CrossOrigin
@RequestMapping("/status")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@GetMapping("")
	public ResponseEntity<?> listOfStatus(){	
		return new ResponseEntity<Iterable<Role>>(roleService.list(),HttpStatus.OK);
	}
}
