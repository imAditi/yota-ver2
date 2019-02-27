package com.yash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.domain.Test;
import com.yash.repository.TestRepository;
import com.yash.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestRepository testRepository;
	
	@Override
	public Test saveOrupdate(Test test) {
		
		return testRepository.save(test);
	}

	@Override
	public Long delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Test show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Test> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
