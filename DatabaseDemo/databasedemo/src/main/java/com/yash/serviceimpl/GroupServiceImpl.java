package com.yash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.domain.TestGroup;
import com.yash.repository.GroupRepository;
import com.yash.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	GroupRepository groupRepository;
	
	@Override
	public TestGroup saveOrupdate(TestGroup group) {
		
		return groupRepository.save(group);
	}

	@Override
	public Long delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestGroup show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TestGroup> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
