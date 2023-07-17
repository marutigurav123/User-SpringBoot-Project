package com.User.User.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.User.User.dto.User;
import com.User.User.repository.UserRepo;
@Repository
public class UserDao {
	
	@Autowired
	UserRepo userRepo;
	
	
	public User saveUser(User user) {
		return userRepo.save(user);
		
	}
	
	public Optional<User> getUserById(int id) {
		return userRepo.findById(id);	
	}
	
//	public List<User> getAllusersData(){
//		return userRepo.findAll();
//		
//	}
	
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	public void deleteByid(int id) {
		 userRepo.deleteById(id);
			
	}
	
	
	
	

}
