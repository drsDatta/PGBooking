package com.project.service;

import java.util.List;

import com.project.dao.PgRepository;
import com.project.dao.UserRepository;
import com.project.entities.Pg;
import com.project.entities.User;

public interface PgExService {
	public Pg addPg(PgRepository pgRepository,Pg pg);
	public List<Pg> getPg(PgRepository pgRepository);
	public Pg getByPgId(PgRepository pgRepository,int id);
	public String removePgId(PgRepository pgRepository,int id);
	public Pg updatePg(PgRepository pgRepository,Pg newpg,int id );
	//public User loginUser(UserRepository userRepository,User user);
}
