package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.FacilityRepository;
import com.project.entities.Facility;
@Service
public class FacilityExImpl implements FacilityExService{
	Facility oldFac;
	List<Facility>faclist;
	@Autowired
	FacilityRepository facilityRepository;
	private FacilityExImpl() {
		faclist=new ArrayList<>();
	}
	@Override
	public Facility setFacility(FacilityRepository facilityRepository, Facility facility) {
		facilityRepository.save(facility);
		return facility;
	}

	@Override
	public List<Facility> getFacility(FacilityRepository facilityRepository) {
		Iterable<Facility>itr=facilityRepository.findAll();
		Iterator<Facility>it=itr.iterator();
		while(it.hasNext()) {
			Facility facility=it.next();
			faclist.add(facility);
		}
		return faclist;
	}

	@Override
	public Facility getFacilityById(FacilityRepository facilityRepository, int id) {
		Optional<Facility>op=facilityRepository.findById(id);
		Facility facility=op.get();
		return facility;
	}

	@Override
	public String removeFacilityById(FacilityRepository facilityRepository, int id) {
		facilityRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public Facility updateFacility(FacilityRepository facilityRepository, Facility newfacility, int id) {
		Optional<Facility>op=facilityRepository.findById(id);
		try{
			oldFac=op.get();
			oldFac.setParking(newfacility.getParking());
			oldFac.setBreakfast(newfacility.getBreakfast());
			oldFac.setLunch(newfacility.getLunch());
			oldFac.setDinner(newfacility.getDinner());
			oldFac.setWater_storage(newfacility.getWater_storage());
			oldFac.setWater_purifier(newfacility.getWater_purifier());
			oldFac.setWaste_disposal(newfacility.getWaste_disposal());
			oldFac.setAc(newfacility.getAc());
			oldFac.setTv(newfacility.getTv());
			oldFac.setWifi(newfacility.getWifi());
			oldFac.setKitchen(newfacility.getKitchen());
			oldFac.setLaundry(newfacility.getLaundry());
		facilityRepository.save(oldFac);
		}catch(Exception e){
			System.err.println("no object found"+e);
		}
		return oldFac;
	}

}
