package com.project.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.PgRepository;
import com.project.entities.Pg;
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
}
