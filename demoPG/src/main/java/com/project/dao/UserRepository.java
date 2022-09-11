package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
