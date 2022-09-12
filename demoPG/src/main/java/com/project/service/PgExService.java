package com.project.service;

import com.project.dao.PgRepository;
import com.project.entities.Pg;

public interface PgExService {
	public Pg addPg(PgRepository pgRepository,Pg pg);
}
