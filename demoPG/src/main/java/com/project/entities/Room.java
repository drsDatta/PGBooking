package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="type",nullable = false)
	@Size(max=20)
	private String type;
	@Column(name="no_of_bed",nullable = false)
	private int no_of_bed;
	@Column(name="image",nullable = false)
	@Size(max=200)
	private String image;
	@Column(name="no_of_guest",nullable = false)
	private int no_of_guest;
	@Column(name="size",nullable=false)
	@Size(max=20)
	private String size;
	@Column(name="rent",nullable = false)
	private int rent;
	@Column(name="status",nullable=false)
	@Value("0")
	@Size(max=1)
	private int status;
	//private int pg_id;
	
	public Room() {
		
	}
	public Room(int id, @Size(max = 20) String type, int no_of_bed, @Size(max = 200) String image, int no_of_guest,
			@Size(max = 20) String size, int rent, @Size(max = 1) int status) {
		super();
		this.id = id;
		this.type = type;
		this.no_of_bed = no_of_bed;
		this.image = image;
		this.no_of_guest = no_of_guest;
		this.size = size;
		this.rent = rent;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNo_of_bed() {
		return no_of_bed;
	}
	public void setNo_of_bed(int no_of_bed) {
		this.no_of_bed = no_of_bed;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getNo_of_guest() {
		return no_of_guest;
	}
	public void setNo_of_guest(int no_of_guest) {
		this.no_of_guest = no_of_guest;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
