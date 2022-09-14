package com.project.service;

import com.project.dao.PaymentRepository;
import com.project.entities.Payments;

public interface PaymentExService {
	public Payments payment(PaymentRepository paymentRepository ,Payments payment);

}
