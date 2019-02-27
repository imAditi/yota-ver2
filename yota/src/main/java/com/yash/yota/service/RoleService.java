package com.yash.yota.service;

import java.util.Optional;

import org.springframework.stereotype.Service;


import com.yash.yota.domain.Role;
@Service
public interface RoleService {

	public Role saveOrupdate();
	
	public Long delete();
	
	public Optional<Role> show(Long id);
	
	public Iterable<Role> list();
}
