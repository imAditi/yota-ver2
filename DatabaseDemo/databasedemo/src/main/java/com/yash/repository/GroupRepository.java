package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.TestGroup;

	@Repository
	public interface GroupRepository  extends CrudRepository<TestGroup, Integer>{

		
	}