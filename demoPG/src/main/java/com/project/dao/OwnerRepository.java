package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer> {

}
