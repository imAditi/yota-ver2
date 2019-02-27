package com.yash.yota.serviceimpl;

import java.util.Optional;

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
	public Status saveOrupdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Status> show(Long id) {
		return statusRepository.findById(id);
	}

	@Override
	public Iterable<Status> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
