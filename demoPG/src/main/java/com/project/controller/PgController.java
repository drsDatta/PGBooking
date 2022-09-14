package com.project.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.PgRepository;
import com.project.entities.Pg;
import com.project.entities.User;
import com.project.service.PgExImpl;

@RestController
public class PgController implements Serializable{
	@Autowired
	PgRepository pgRepository;
	@Autowired
	PgExImpl pgExImpl;
	
	@PostMapping("/setpg")
	public Pg addPg(@RequestBody Pg pg) {
		return this.pgExImpl.addPg(pgRepository, pg);
	}
	@RequestMapping("/showPg")
	public List<Pg> listPg(){
		return this.pgExImpl.getPg(pgRepository);
	}
	
	@RequestMapping("/getPg/{id}")
	public Pg getByPgId(@PathVariable String id) {
		return this.pgExImpl.getByPgId(pgRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removePg/{id}")
	public String removePgId(@PathVariable String id) {
		if(id!=null) {
			return this.pgExImpl.removePgId(pgRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@PutMapping("/updatePg/{id}")
	public Pg updatePg(@RequestBody Pg pg,@PathVariable String id) {
		return this.pgExImpl.updatePg(pgRepository, pg, Integer.parseInt(id));
	}
}
