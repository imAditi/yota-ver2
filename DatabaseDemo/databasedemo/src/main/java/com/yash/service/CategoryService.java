package com.yash.service;

import org.springframework.stereotype.Service;

import com.yash.domain.Category;
@Service
public interface CategoryService {

	public Category saveOrupdate();
	
	public Long delete();
	
	public Category show();
	
	public Iterable<Category> list();
}
