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

import com.project.dao.FacilityRepository;
import com.project.entities.Facility;
import com.project.service.FacilityExImpl;

@RestController
public class FacilityController {
	@Autowired
	FacilityRepository facilityRepository;
	@Autowired
	FacilityExImpl facilityExImpl;
	
	@PostMapping("/setFacility")
	public Facility setFacility(@RequestBody Facility facility) {
		return this.facilityExImpl.setFacility(facilityRepository, facility);
	}
	@RequestMapping("/showFacility")
	public List<Facility> showFacility(){
		return this.facilityExImpl.getFacility(facilityRepository);
	}
	@RequestMapping("/getFacility/{id}")
	public Facility getUser(@PathVariable String id) {
		return this.facilityExImpl.getFacilityById(facilityRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeFacility/{id}")
	public String removeUser(@PathVariable String id) {
		if(id!=null) {
			return this.facilityExImpl.removeFacilityById(facilityRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@PutMapping("/updateFacility/{id}")
	public Facility updateFacility(@RequestBody Facility facility,@PathVariable String id) {
		return this.facilityExImpl.updateFacility(facilityRepository, facility, Integer.parseInt(id));
	}
}
