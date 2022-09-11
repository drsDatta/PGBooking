package com.project.service;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserRepository;
import com.project.entities.User;


@Service
public class UserExImpl implements UserExService{
	User oldUser;
	List<User>ulist;
	@Autowired
	UserRepository userRepository;
	private UserExImpl() {
		ulist=new ArrayList<>();
	}
	@Override
	public User setUser(UserRepository userRepository, User user) {
		userRepository.save(user);
		return user;
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
	@Override
	public User updateUser(UserRepository userRepository, User newUser, int id) {
		Optional<User>op=userRepository.findById(id);
		try{
			oldUser=op.get();
		oldUser.setFirst_name(newUser.getFirst_name());
		oldUser.setLast_name(newUser.getLast_name());
		oldUser.setEmail(newUser.getEmail());
		oldUser.setPhone_no(newUser.getPhone_no());
		oldUser.setBirth_date(newUser.getBirth_date());
		oldUser.setGender(newUser.getGender());
		oldUser.setAddress(newUser.getAddress());
		oldUser.setCity(newUser.getCity());
		oldUser.setState(newUser.getState());
		oldUser.setCountry(newUser.getCountry());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setProfile_image(newUser.getProfile_image());
		userRepository.save(oldUser);
		}catch(Exception e){
			System.err.println("no object found"+e);
		}
		return oldUser;
	}
	@Override
	public User loginUser(UserRepository userRepository, User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
