package com.project.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class Pg {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name",nullable = false)
	@Size(max = 20, message = "This is required")
	private String name;
	@Column(name="address",nullable = false)
	@Size(max = 50, message = "This is required")
	private String address;
	@Column(name="city",nullable = false)
	@Size(max = 20, message = "This is required")
	private String city;
	@Column(name="state",nullable = false)
	@Size(max = 20, message = "This is required")
	private String state;
	@Column(name="country",nullable = false)
	@Size(max = 20, message = "This is required")
	private String country;
	@Column(name="pincode",nullable = false)
	@Size(max = 6, message = "This is required")
	private int pincode;
	//@Column(nullable=false)
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "facility_id", referencedColumnName = "id")
	    private Facility facility;
	 @OneToMany(targetEntity = Room.class,cascade = CascadeType.ALL)
		@JoinColumn(name="pg_id",referencedColumnName ="id")
		private Set pg;
	// @Column(nullable=false)
	 @OneToMany(targetEntity = Booking.class,cascade = CascadeType.ALL)
		@JoinColumn(name="Pg_id",referencedColumnName ="id")
		private Set booking;
	
//	@ManyToOne()
//    @JoinColumn(name="owner",nullable=false)
//	Owner owner_id;
	
	@Override
	public String toString() {
		return "Pg [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + ", owner_id="  + "]";
	}
	public Pg(int id, @Size(max = 20, message = "This is required") String name,
			@Size(max = 50, message = "This is required") String address,
			@Size(max = 20, message = "This is required") String city,
			@Size(max = 20, message = "This is required") String state,
			@Size(max = 20, message = "This is required") String country,
			@Size(max = 6, message = "This is required") int pincode,  Owner owner_id) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		//this.owner_id = owner_id;
	}
//	public Owner getOwner_id() {
//		return owner_id;
//	}
//	public void setOwner_id(Owner owner_id) {
//		this.owner_id = owner_id;
//	}
	public Pg(int id, @Size(max = 20, message = "This is required") String name,
			@Size(max = 50, message = "This is required") String address,
			@Size(max = 20, message = "This is required") String city,
			@Size(max = 20, message = "This is required") String state,
			@Size(max = 20, message = "This is required") String country,
			@Size(max = 6, message = "This is required") int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Pg() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
