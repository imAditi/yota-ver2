package com.yash.service;

import org.springframework.stereotype.Service;

import com.yash.domain.Test;
@Service
public interface TestService {

	public Test saveOrupdate(Test test);
	
	public Long delete();
	
	public Test show();
	
	public Iterable<Test> list();
}
