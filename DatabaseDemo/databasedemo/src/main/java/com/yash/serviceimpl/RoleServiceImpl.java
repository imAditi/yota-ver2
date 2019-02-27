package com.yash.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.domain.Role;
import com.yash.repository.RoleRepository;
import com.yash.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role saveOrupdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Role> list() {
		
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> show(Long id) {
		return roleRepository.findById(id); 
		
	}

}
