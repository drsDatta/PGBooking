package com.project.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="amount",nullable = false)
	@Size(max=6)
	private int amount;
	@Column(name="status",nullable = false)
	@Size(max=20)
	private String status;
	@Column(name="p_date",nullable = false)
	private Date p_date;
	@Column(name="transaction_id",nullable = false)
	@Size(max=20)
	private String transaction_id;
	//private int user_id;
	public Payments() {
		
	}
	public Payments(int id, @Size(max = 6) int amount, @Size(max = 20) String status, Date p_date,
			@Size(max = 20) String transaction_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.status = status;
		this.p_date = p_date;
		this.transaction_id = transaction_id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	
}
