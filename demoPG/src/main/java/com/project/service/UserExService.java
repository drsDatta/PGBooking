package com.project.service;

import java.util.List;

import com.project.dao.UserRepository;
import com.project.entities.User;

public interface UserExService {
	public User setUser(UserRepository userRepository,User user);
	public List<User> getUser(UserRepository userRepository);
	public User getById(UserRepository userRepository,int id);
	public String removeId(UserRepository userRepository,int id);
	public User updateUser(UserRepository userRepository,User user,int id );
	public User loginUser(UserRepository userRepository,User user);
}
