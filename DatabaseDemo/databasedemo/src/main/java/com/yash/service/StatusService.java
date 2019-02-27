package com.yash.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yash.domain.Question;
import com.yash.domain.Status;
@Service
public interface StatusService {


	public Status saveOrupdate();
	
	public Long delete();
	
	public  Optional<Status> show(Long id);
	
	public Iterable<Status> list();
}
