package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.PaymentRepository;
import com.project.entities.Payments;
import com.project.service.PaymentExImpl;

@RestController
public class PaymentController {
	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	PaymentExImpl paymentExImpl;
	
	@PostMapping("/payment")
	public Payments addPayment(@RequestBody Payments payment) {
		return this.paymentExImpl.payment(paymentRepository, payment);
	}
	
}
