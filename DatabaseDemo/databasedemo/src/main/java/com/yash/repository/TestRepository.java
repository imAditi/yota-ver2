package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Test;

@Repository
public interface TestRepository  extends CrudRepository<Test, Long>{

}
