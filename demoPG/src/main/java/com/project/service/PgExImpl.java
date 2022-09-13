package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PgRepository;
import com.project.dao.UserRepository;
import com.project.entities.Pg;
import com.project.entities.User;
@Service
public class PgExImpl implements PgExService{
	Pg oldPg;
	List<Pg>pglist;
	@Autowired
	UserRepository userRepository;
	private PgExImpl() {
		pglist=new ArrayList<>();
	}
	@Override
	public Pg addPg(PgRepository pgRepository, Pg pg) {
		pgRepository.save(pg);
		return pg;
	}

	@Override
	public List<Pg> getPg(PgRepository pgRepository) {
		Iterable<Pg>itr=pgRepository.findAll();
		Iterator<Pg>it=itr.iterator();
		while(it.hasNext()) {
			Pg pg=it.next();
			pglist.add(pg);
		}
		return pglist;
	}

	@Override
	public Pg getByPgId(PgRepository pgRepository, int id) {
		Optional<Pg>op=pgRepository.findById(id);
		Pg pg=op.get();
		return pg;
	}

	@Override
	public String removePgId(PgRepository pgRepository, int id) {
		pgRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public Pg updatePg(PgRepository pgRepository, Pg newpg, int id) {
		Optional<Pg>op=pgRepository.findById(id);
		try{
			oldPg=op.get();
			oldPg.setName(newpg.getName());
			oldPg.setAddress(newpg.getAddress());
			oldPg.setCity(newpg.getCity());
			oldPg.setCountry(newpg.getCountry());
			oldPg.setState(newpg.getState());
			oldPg.setCountry(newpg.getCountry());
		pgRepository.save(oldPg);
		}catch(Exception e){
			System.err.println("no object found"+e);
		}
		return oldPg;
	}

}
