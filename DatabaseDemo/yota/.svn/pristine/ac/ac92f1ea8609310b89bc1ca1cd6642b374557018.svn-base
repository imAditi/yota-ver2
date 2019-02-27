package com.yash.yota.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.yota.domain.Status;
import com.yash.yota.repository.StatusRepository;
import com.yash.yota.service.StatusService;


@Service
public class StatusServiceImpl implements StatusService{
	
	@Autowired
	StatusRepository statusRepository;
	
	@Override
	public Status findById(Long id) {
		return statusRepository.findById(id).get();
	}

}
