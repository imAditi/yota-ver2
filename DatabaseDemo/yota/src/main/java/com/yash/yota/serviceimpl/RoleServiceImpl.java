package com.yash.yota.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.yota.domain.Role;
import com.yash.yota.repository.RoleRepository;
import com.yash.yota.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role findById(Long id) {
		return roleRepository.findById(id).get();
	}

	
}
