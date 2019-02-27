package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Option;


@Repository
public interface  OptionRepository extends CrudRepository<Option, Long>{

}
