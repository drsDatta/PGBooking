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

import com.project.dao.AdminRepository;
import com.project.dao.UserRepository;
import com.project.entities.Admin;
import com.project.entities.User;
import com.project.service.AdminExImpl;
import com.project.service.UserExImpl;

@RestController
public class AdminController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserExImpl userExImpl;
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	AdminExImpl adminExImpl;
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return this.adminExImpl.setAdmin(adminRepository, admin);
	}	
	@RequestMapping("/search/{id}")
	public Admin search(@PathVariable String id) {
		return this.adminExImpl.searchAdmin(adminRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdmin/{id}")
	public String remove(@PathVariable String id) {
		return this.adminExImpl.removeAdmin(adminRepository, Integer.parseInt(id));
	}
	@RequestMapping("/showAdmin")
	public List<Admin> show(){
		return this.adminExImpl.showAdmin(adminRepository);
	}
	@PutMapping("updateAdmin/{id}")
	public Admin update(@RequestBody Admin admin,@PathVariable String id) {
		return this.adminExImpl.updateAdmin(adminRepository, admin, Integer.parseInt(id));
	}
	@RequestMapping("/showAdminUser")
	public List<User> listUser(){
		return this.userExImpl.getUser(userRepository);
	}
	@RequestMapping("/getAdminUser/{id}")
	public User getUser(@PathVariable String id) {
		return this.userExImpl.getById(userRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdminUser/{id}")
	public String removeUser(@PathVariable String id) {
		if(id!=null) {
			return this.userExImpl.removeId(userRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
}
