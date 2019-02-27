package com.yash.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.domain.Test;
import com.yash.service.TestService;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;
	
	@PostMapping("")
	public ResponseEntity<?> createTest(@RequestBody Test test){
		Test test1 = testService.saveOrupdate(test);
		return new ResponseEntity<Test>(test1,HttpStatus.CREATED);
	} 
}
