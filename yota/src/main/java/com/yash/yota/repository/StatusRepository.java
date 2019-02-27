package com.yash.yota.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.yota.domain.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status,Long>{

	
}
