package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.domain.User;
import java.lang.Long;
import java.util.List;

@Repository
public interface  UserRepository extends CrudRepository<User, Long>{

	public User findByEmail(String email);
	
	List<User> findByRegistrationCode(Long registrationcode);
}
