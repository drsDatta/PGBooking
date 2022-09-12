package com.project.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="purpose_of_visit",nullable = false)
	@Size(max=60)
	private String purpose_of_visit;
	@Column(name="id_proof",nullable = false)
	@Size(max=60)
	private String id_proof;
	@Column(name="id_proof_no",nullable = false)
	@Size(max=60)
	private String id_proof_no;
	@Column(name="chekin_date",nullable = false)
	private Date chekin_date;
	@Column(name="chekout_date",nullable = false)
	private Date checkout_date;
	@Column(name="booking_price",nullable = false)
	private int booking_price;
	//	private int user_id;
	//	private int pg_id;
	//	private int room_id;
	//	private int payment_id;
	public Booking() {
		
	}
	public Booking(int id, @Size(max = 60) String purpose_of_visit, @Size(max = 60) String id_proof,
			@Size(max = 60) String id_proof_no, Date chekin_date, Date checkout_date, int booking_price) {
		super();
		this.id = id;
		this.purpose_of_visit = purpose_of_visit;
		this.id_proof = id_proof;
		this.id_proof_no = id_proof_no;
		this.chekin_date = chekin_date;
		this.checkout_date = checkout_date;
		this.booking_price = booking_price;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getPurpose_of_visit() {
		return purpose_of_visit;
	}
	public void setPurpose_of_visit(String purpose_of_visit) {
		this.purpose_of_visit = purpose_of_visit;
	}
	public String getId_proof() {
		return id_proof;
	}
	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}
	public String getId_proof_no() {
		return id_proof_no;
	}
	public void setId_proof_no(String id_proof_no) {
		this.id_proof_no = id_proof_no;
	}
	public Date getChekin_date() {
		return chekin_date;
	}
	public void setChekin_date(Date chekin_date) {
		this.chekin_date = chekin_date;
	}
	public Date getCheckout_date() {
		return checkout_date;
	}
	public void setCheckout_date(Date checkout_date) {
		this.checkout_date = checkout_date;
	}
	public int getBooking_price() {
		return booking_price;
	}
	public void setBooking_price(int booking_price) {
		this.booking_price = booking_price;
	}
	
}
