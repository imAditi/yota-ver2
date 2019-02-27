package com.yash.service;

import org.springframework.stereotype.Service;

import com.yash.domain.Option;

@Service
public interface OptionService {

	public Option saveOrupdate();
	
	public Long delete();
	
	public Option show();
	
	public Iterable<Option> list();
}
