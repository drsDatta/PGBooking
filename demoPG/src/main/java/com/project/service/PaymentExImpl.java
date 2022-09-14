package com.project.service;

import org.springframework.stereotype.Service;

import com.project.dao.PaymentRepository;
import com.project.entities.Payments;
@Service
public class PaymentExImpl implements PaymentExService{
	
	@Override
	public Payments payment(PaymentRepository paymentRepository, Payments payment) {
		paymentRepository.save(payment);
		return payment;
	}

}
