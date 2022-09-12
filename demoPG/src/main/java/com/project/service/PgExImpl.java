package com.project.service;

import org.springframework.stereotype.Service;

import com.project.dao.PgRepository;
import com.project.entities.Pg;
@Service
public class PgExImpl implements PgExService{

	@Override
	public Pg addPg(PgRepository pgRepository, Pg pg) {
		pgRepository.save(pg);
		return pg;
	}

}
