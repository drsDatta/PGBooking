package com.project.service;

import java.util.List;

import com.project.dao.FacilityRepository;
import com.project.dao.UserRepository;
import com.project.entities.Facility;
import com.project.entities.User;

public interface FacilityExService {
	public Facility setFacility(FacilityRepository facilityRepository,Facility facility);
	public List<Facility> getFacility(FacilityRepository facilityRepository);
	public Facility getFacilityById(FacilityRepository facilityRepository,int id);
	public String removeFacilityById(FacilityRepository facilityRepository,int id);
	public Facility updateFacility(FacilityRepository facilityRepository,Facility newfacility,int id );
	//public User loginUser(UserRepository userRepository,User user);
}
