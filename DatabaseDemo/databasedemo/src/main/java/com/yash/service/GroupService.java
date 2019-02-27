package com.yash.service;

import org.springframework.stereotype.Service;

import com.yash.domain.TestGroup;
@Service
public interface GroupService {

	public TestGroup saveOrupdate(TestGroup group);
	
	public Long delete();
	
	public TestGroup show();
	
	public Iterable<TestGroup> list();
}
