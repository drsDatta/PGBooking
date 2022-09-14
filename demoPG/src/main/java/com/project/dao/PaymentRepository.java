package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Payments;
@Repository
public interface PaymentRepository extends CrudRepository<Payments, Integer>{

}
