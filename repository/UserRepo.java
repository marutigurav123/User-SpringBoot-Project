package com.User.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.User.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	
	

}
