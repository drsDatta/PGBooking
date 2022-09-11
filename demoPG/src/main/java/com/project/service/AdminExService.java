package com.project.service;

import java.util.List;

import com.project.dao.AdminRepository;
import com.project.dao.UserRepository;
import com.project.entities.Admin;
import com.project.entities.User;

public interface AdminExService {
	public Admin setAdmin(AdminRepository adminRepository,Admin admin);
	public Admin searchAdmin(AdminRepository adminRepository,int id);
	public String removeAdmin(AdminRepository adminRepository,int id);
	public List<Admin> showAdmin(AdminRepository adminRepository);
	public Admin updateAdmin(AdminRepository adminRepository,Admin newAdmin,int id);
	public List<User> getUser(UserRepository userRepository);
	public User getById(UserRepository userRepository,int id);
	public String removeId(UserRepository userRepository,int id);
}
