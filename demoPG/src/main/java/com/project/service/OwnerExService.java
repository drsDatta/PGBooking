package com.project.service;

import java.util.List;

import com.project.dao.OwnerRepository;
import com.project.entities.Owner;

public interface OwnerExService{
	public Owner setOwner(OwnerRepository ownerRepository,Owner owner);
	public List<Owner> showOwner(OwnerRepository ownerRepository);
	public Owner searchOwner(OwnerRepository ownerRepository,int id);
	public String deletOwner(OwnerRepository ownerRepository,int id);
	public Owner updateOwner(OwnerRepository ownerRepository,Owner newOwner,int id);
}
