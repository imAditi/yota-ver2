package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
