package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.OwnerRepository;
import com.project.entities.Owner;

@Service
public class OwnerExImpl implements OwnerExService{
	Owner oldOwner;
	@Autowired
	OwnerRepository ownerRepository;
	List<Owner>oList;
	@Autowired
	public OwnerExImpl() {
		oList=new ArrayList<>();
	}

	@Override
	public Owner setOwner(OwnerRepository ownerRepository, Owner owner) {
		ownerRepository.save(owner);
		return owner;
	}


	@Override
	public List<Owner> showOwner(OwnerRepository ownerRepository) {
		Iterable<Owner> it=ownerRepository.findAll();
		Iterator<Owner>itr=it.iterator();
		while(itr.hasNext()) {
			Owner owner=itr.next();
			oList.add(owner);
		}
		return oList;
	}

	@Override
	public Owner searchOwner(OwnerRepository ownerRepository, int id) {
		Optional<Owner>op=ownerRepository.findById(id);
		Owner owner=op.get();
		return owner;
	}

	@Override
	public String deletOwner(OwnerRepository ownerRepository, int id) {
		ownerRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public Owner updateOwner(OwnerRepository ownerRepository, Owner newOwner, int id) {
		Optional<Owner>op=ownerRepository.findById(id);
		try
		{
			oldOwner=op.get();
			oldOwner.setFirst_name(newOwner.getFirst_name());
			oldOwner.setLast_name(newOwner.getLast_name());
			oldOwner.setEmail(newOwner.getEmail());
			oldOwner.setPhone_no(newOwner.getPhone_no());
			oldOwner.setBirth_date(newOwner.getBirth_date());
			oldOwner.setGender(newOwner.getGender());
			oldOwner.setAddress(newOwner.getAddress());
			oldOwner.setCity(newOwner.getCity());
			oldOwner.setState(newOwner.getState());
			oldOwner.setCountry(newOwner.getCountry());
			oldOwner.setPassword(newOwner.getPassword());
			oldOwner.setProfile_image(newOwner.getProfile_image());
			ownerRepository.save(oldOwner);
		}catch(Exception e) {
			System.err.println("error:"+e);
		}
		return oldOwner;
	}
	
}
