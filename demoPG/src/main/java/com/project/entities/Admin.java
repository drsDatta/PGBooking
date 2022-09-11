package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="email",unique=true,nullable = false)
	@Size(max = 80, message = "This is required")
	private String email;
	@Column(name="password",nullable = false)
	@Size(max = 512, message = "This is required")
	private String password;
	
	public Admin() {
		
	}	
	public Admin(int id, @Size(max = 80, message = "This is required") String email,
			@Size(max = 512, message = "This is required") String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
