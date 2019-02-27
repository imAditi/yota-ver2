package com.yash.yota.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.yota.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
