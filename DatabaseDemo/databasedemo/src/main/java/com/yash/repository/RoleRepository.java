package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
