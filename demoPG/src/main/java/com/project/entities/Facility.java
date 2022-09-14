package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import lombok.Builder.Default;
@Entity
public class Facility {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="parking",nullable = false)
	@Size(max=1)
	@Value("0")
	private int parking;
	@Column(name="breakfast",nullable = false)
	@Size(max=1)
	@Value("0")
	private int breakfast;
	@Column(name="lunch",nullable = false)
	@Size(max=1)
	@Value("0")
	private int lunch;
	@Column(name="dinner",nullable = false)
	@Size(max=1)
	@Value("0")
	private int dinner;
	@Column(name="water_storage",nullable = false)
	@Size(max=1)
	@Value("0")
	private int water_storage;
	@Column(name="water_purifier",nullable = false)
	@Size(max=1)
	@Value("0")
	private int water_purifier;
	@Column(name="waste_disposal",nullable = false)
	@Size(max=1)
	@Value("0")
	private int waste_disposal;
	@Column(name="ac",nullable = false)
	@Size(max=1)
	@Value("0")
	private int ac;
	@Column(name="tv",nullable = false)
	@Size(max=1)
	@Value("0")
	private int tv;
	@Column(name="wifi",nullable = false)
	@Size(max=1)
	@Value("0")
	private int wifi;
	@Column(name="kitchen",nullable = false)
	@Size(max=1)
	@Value("0")
	private int kitchen;
	@Column(name="laundry",nullable = false)
	@Size(max=1)
	@Value("0")
	private int laundry;
	
	public Facility() {
		
	}
	public Facility(int id, @Size(max = 1) int parking, @Size(max = 1) int breakfast, @Size(max = 1) int lunch,
			@Size(max = 1) int dinner, @Size(max = 1) int water_storage, @Size(max = 1) int water_purifier,
			@Size(max = 1) int waste_disposal, @Size(max = 1) int ac, @Size(max = 1) int tv, @Size(max = 1) int wifi,
			@Size(max = 1) int kitchen, @Size(max = 1) int laundry) {
		super();
		this.id = id;
		this.parking = parking;
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
		this.water_storage = water_storage;
		this.water_purifier = water_purifier;
		this.waste_disposal = waste_disposal;
		this.ac = ac;
		this.tv = tv;
		this.wifi = wifi;
		this.kitchen = kitchen;
		this.laundry = laundry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParking() {
		return parking;
	}
	public void setParking(int parking) {
		this.parking = parking;
	}
	public int getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(int breakfast) {
		this.breakfast = breakfast;
	}
	public int getLunch() {
		return lunch;
	}
	public void setLunch(int lunch) {
		this.lunch = lunch;
	}
	public int getDinner() {
		return dinner;
	}
	public void setDinner(int dinner) {
		this.dinner = dinner;
	}
	public int getWater_storage() {
		return water_storage;
	}
	public void setWater_storage(int water_storage) {
		this.water_storage = water_storage;
	}
	public int getWater_purifier() {
		return water_purifier;
	}
	public void setWater_purifier(int water_purifier) {
		this.water_purifier = water_purifier;
	}
	public int getWaste_disposal() {
		return waste_disposal;
	}
	public void setWaste_disposal(int waste_disposal) {
		this.waste_disposal = waste_disposal;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public int getTv() {
		return tv;
	}
	public void setTv(int tv) {
		this.tv = tv;
	}
	public int getWifi() {
		return wifi;
	}
	public void setWifi(int wifi) {
		this.wifi = wifi;
	}
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}
	public int getLaundry() {
		return laundry;
	}
	public void setLaundry(int laundry) {
		this.laundry = laundry;
	}
	
	
}
