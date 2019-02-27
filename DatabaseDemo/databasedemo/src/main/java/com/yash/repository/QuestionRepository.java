package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Question;


@Repository
public interface  QuestionRepository extends CrudRepository<Question, Long>{

}
