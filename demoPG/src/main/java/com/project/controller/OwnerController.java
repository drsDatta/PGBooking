package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.OwnerRepository;
import com.project.entities.Owner;
import com.project.service.OwnerExImpl;

@RestController
public class OwnerController {
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	OwnerExImpl ownerExImpl;
	
	@PostMapping("/setowner")
	public Owner setOwner(@RequestBody Owner owner) {
		return this.ownerExImpl.setOwner(ownerRepository, owner);
	}
	@GetMapping("/showowner")
	public List<Owner> showOwner(){
		return this.ownerExImpl.showOwner(ownerRepository);
	}
	
	@GetMapping("/searchowner/{id}")
	public Owner searchOwner(@PathVariable String id) {
		return this.ownerExImpl.searchOwner(ownerRepository, Integer.parseInt(id));
	}
	
	@DeleteMapping("/deleteowner/{id}")
	public String deleteOwner(@PathVariable String id) {
		return this.ownerExImpl.deletOwner(ownerRepository, Integer.parseInt(id));
	}
	@PutMapping("/updateowner/{id}")
	public Owner updateOwner(@RequestBody Owner owner,@PathVariable String id) {
		return this.ownerExImpl.updateOwner(ownerRepository, owner, Integer.parseInt(id));
	}

}
