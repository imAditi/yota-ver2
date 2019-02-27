package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status,Long>{

	
}
