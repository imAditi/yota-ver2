package com.yash.service;

import org.springframework.stereotype.Service;

import com.yash.domain.Question;
@Service
public interface QuestionService {

	public Question saveOrupdate();
	
	public Long delete();
	
	public Question show();
	
	public Iterable<Question> list();
}
