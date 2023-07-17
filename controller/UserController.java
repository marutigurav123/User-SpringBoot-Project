package com.User.User.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.User.User.dao.UserDao;
import com.User.User.dto.User;
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserDao userDao;
	
	@PostMapping
	public User saveData(@RequestBody User user)
	{
		
		return userDao.saveUser(user);	
	}
	@GetMapping 
	public Optional<User> getByid(@RequestParam int id) {
		return userDao.getUserById(id);	
	}
	
//	@GetMapping
//	public List<User> getAlldata(){
//		return userDao.getAllusersData();	
//	}
	@PutMapping
	public User updateData(@RequestBody User user) {
		return userDao.updateUser(user);	
	}
	@DeleteMapping
	public String DeleteData(@RequestParam int id) {
		Optional<User> u=userDao.getUserById(id);
		if(u.isPresent()) {
			userDao.deleteByid(id);
			return "Data is Dalated";
		}else {
			return "Data not Present";
		}
		
		
	}
	
	
}
