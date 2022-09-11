package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.UserRepository;
import com.project.entities.User;
import com.project.service.UserExImpl;
import com.project.service.UserExService;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserExImpl userExImpl;
	@RequestMapping("/show")
	public List<User> listUser(){
		return this.userExImpl.getUser(userRepository);
	}
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return this.userExImpl.setUser(userRepository, user);
	}
	@RequestMapping("/get/{id}")
	public User getUser(@PathVariable String id) {
		return this.userExImpl.getById(userRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/remove/{id}")
	public String removeUser(@PathVariable String id) {
		if(id!=null) {
			return this.userExImpl.removeId(userRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@PutMapping("/update/{id}")
	public User updateUser(@RequestBody User user,@PathVariable String id) {
		return this.userExImpl.updateUser(userRepository, user, Integer.parseInt(id));
	}
}
