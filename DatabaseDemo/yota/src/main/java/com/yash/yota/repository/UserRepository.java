package com.yash.yota.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.yota.command.LoginCommand;
import com.yash.yota.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByLoginname(String loginname);
}
