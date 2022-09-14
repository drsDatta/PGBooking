package com.project.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="first_name",nullable = false)
	@Size(max = 50, message = "This is required")
	private String first_name;
	@Column(name="last_name",nullable = false)
	@Size(max = 50, message = "This is required")
	private String last_name;
	@Column(name="email",unique=true,nullable = false)
	@Size(max = 80, message = "This is required")
	private String email;
	@Column(name="phone_no",unique=true,nullable = false)
	@Size(max = 12, message = "This is required")
	private String phone_no;
	@Column(name="birth_date",nullable = false)
	@Size(message="This is required")
	private Date birth_date;
	@Column(name="gender",nullable = false)
	@Size(max = 20, message = "This is required")
	private String gender;
	@Column(name="address",nullable = false)
	@Size(max = 50, message = "This is required")
	private String address;
	@Column(name="city",nullable = false)
	@Size(max = 50, message = "This is required")
	private String city;
	@Column(name="state",nullable = false)
	@Size(max = 20, message = "This is required")
	private String state;
	@Column(name="country",nullable = false)
	@Size(max = 25, message = "This is required")
	private String country;
	@Column(name="password",nullable = false)
	@Size(max = 512, message = "This is required")
	private String password;
	@Column(name="profile_image")
	@Size(max = 200)
	private String profile_image;
	@Column(name="user_id",nullable=false)
	 @OneToMany(targetEntity = Payments.class,cascade = CascadeType.ALL)
		@JoinColumn(name="user_id",referencedColumnName ="id")
		private Set payment;
	 @OneToMany(targetEntity = Booking.class,cascade = CascadeType.ALL)
		@JoinColumn(name="user_id",referencedColumnName ="id")
		private Set booking;
	public User() {
		
	}
	
	public User(int id, @Size(max = 50, message = "This is required") String first_name,
			@Size(max = 50, message = "This is required") String last_name,
			@Size(max = 80, message = "This is required") String email,
			@Size(max = 12, message = "This is required") String phone_no,
			@Size(message = "This is required") Date birth_date,
			@Size(max = 20, message = "This is required") String gender,
			@Size(max = 50, message = "This is required") String address,
			@Size(max = 50, message = "This is required") String city,
			@Size(max = 20, message = "This is required") String state,
			@Size(max = 25, message = "This is required") String country)
			 {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_no = phone_no;
		this.birth_date = birth_date;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.password = password;
		this.profile_image = profile_image;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
}
