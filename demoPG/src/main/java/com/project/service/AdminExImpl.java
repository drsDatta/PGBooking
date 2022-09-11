package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AdminRepository;
import com.project.dao.UserRepository;
import com.project.entities.Admin;
import com.project.entities.User;
@Service
public class AdminExImpl implements AdminExService{
	List<Admin>alist;
	List<User>ulist;
	Admin oldAdmin;
	@Autowired
	AdminRepository adminRepository;
	
	public AdminExImpl() {
		alist=new ArrayList<>();
		ulist=new ArrayList<>();
	}
	@Override
	public Admin setAdmin(AdminRepository adminRepository, Admin admin) {
		adminRepository.save(admin);
		return admin;
	}
	@Override
	public Admin searchAdmin(AdminRepository adminRepository, int id) {
		// TODO Auto-generated method stub
		Optional<Admin>op=adminRepository.findById(id);
		Admin admin=op.get();
		return admin;
	}
	@Override
	public String removeAdmin(AdminRepository adminRepository, int id) {
		adminRepository.deleteById(id);
		return "Deleted";
	}
	@Override
	public List<Admin> showAdmin(AdminRepository adminRepository) {
		Iterable<Admin> it=adminRepository.findAll();
		Iterator<Admin> itr=it.iterator();
		while(itr.hasNext()) {
			Admin admin=itr.next();
			alist.add(admin);
		}
		return alist;
	}
	@Override
	public Admin updateAdmin(AdminRepository adminRepository, Admin newAdmin, int id) {
		Optional<Admin>op=adminRepository.findById(id);
		try {
		oldAdmin=op.get();
		oldAdmin.setEmail(newAdmin.getEmail());
		oldAdmin.setPassword(newAdmin.getPassword());
		adminRepository.save(oldAdmin);
		}catch(Exception e) {
			System.err.println("error"+e);
		}
		return oldAdmin;
	}
	@Override
	public List<User> getUser(UserRepository userRepository) {
		Iterable<User>itr=userRepository.findAll();
		Iterator<User>it=itr.iterator();
		while(it.hasNext()) {
			User user=it.next();
			ulist.add(user);
		}
		return ulist;
	}
	@Override
	public User getById(UserRepository userRepository, int id) {
		Optional<User>op=userRepository.findById(id);
		User user=op.get();
		return user;
	}
	@Override
	public String removeId(UserRepository userRepository, int id) {
		userRepository.deleteById(id);
		return "deleted";
	}

}
