package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.AdminRepository;
import com.project.dao.BookingRepository;
import com.project.dao.FacilityRepository;
import com.project.dao.OwnerRepository;
import com.project.dao.PgRepository;
import com.project.dao.RoomRepository;
import com.project.dao.UserRepository;
import com.project.entities.Admin;
import com.project.entities.Booking;
import com.project.entities.Facility;
import com.project.entities.Owner;
import com.project.entities.Pg;
import com.project.entities.Room;
import com.project.entities.User;
import com.project.service.AdminExImpl;
import com.project.service.BookingExImpl;
import com.project.service.FacilityExImpl;
import com.project.service.OwnerExImpl;
import com.project.service.PgExImpl;
import com.project.service.RoomExImpl;
import com.project.service.UserExImpl;

@RestController
public class AdminController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserExImpl userExImpl;
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	AdminExImpl adminExImpl;
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	OwnerExImpl ownerExImpl;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	BookingExImpl bookingExImpl;
	@Autowired
	FacilityRepository facilityRepository;
	@Autowired
	FacilityExImpl facilityExImpl;
	@Autowired
	PgRepository pgRepository;
	@Autowired
	PgExImpl pgExImpl;
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomExImpl roomExImpl;
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return this.adminExImpl.setAdmin(adminRepository, admin);
	}	
	@RequestMapping("/search/{id}")
	public Admin search(@PathVariable String id) {
		return this.adminExImpl.searchAdmin(adminRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdmin/{id}")
	public String remove(@PathVariable String id) {
		return this.adminExImpl.removeAdmin(adminRepository, Integer.parseInt(id));
	}
	@RequestMapping("/showAdmin")
	public List<Admin> show(){
		return this.adminExImpl.showAdmin(adminRepository);
	}
	@PutMapping("updateAdmin/{id}")
	public Admin update(@RequestBody Admin admin,@PathVariable String id) {
		return this.adminExImpl.updateAdmin(adminRepository, admin, Integer.parseInt(id));
	}
	@RequestMapping("/showAdminUser")
	public List<User> listUser(){
		return this.userExImpl.getUser(userRepository);
	}
	@RequestMapping("/getAdminUser/{id}")
	public User getUser(@PathVariable String id) {
		return this.userExImpl.getById(userRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdminUser/{id}")
	public String removeUser(@PathVariable String id) {
		if(id!=null) {
			return this.userExImpl.removeId(userRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@GetMapping("/showAdminowner")
	public List<Owner> showOwner(){
		return this.ownerExImpl.showOwner(ownerRepository);
	}
	
	@GetMapping("/searchAdminowner/{id}")
	public Owner searchOwner(@PathVariable String id) {
		return this.ownerExImpl.searchOwner(ownerRepository, Integer.parseInt(id));
	}
	
	@DeleteMapping("/deleteAdminowner/{id}")
	public String deleteOwner(@PathVariable String id) {
		return this.ownerExImpl.deletOwner(ownerRepository, Integer.parseInt(id));
	}
	@GetMapping("/showAdminBooking")
	public List<Booking>bookingList(){
		return this.bookingExImpl.showBooking(bookingRepository);
	}
	@RequestMapping("/showAdminFacility")
	public List<Facility> showFacility(){
		return this.facilityExImpl.getFacility(facilityRepository);
	}
	@RequestMapping("/getAdminFacility/{id}")
	public Facility getFacility(@PathVariable String id) {
		return this.facilityExImpl.getFacilityById(facilityRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdminFacility/{id}")
	public String removeFacility(@PathVariable String id) {
		if(id!=null) {
			return this.facilityExImpl.removeFacilityById(facilityRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@RequestMapping("/showAdminPg")
	public List<Pg> listPg(){
		return this.pgExImpl.getPg(pgRepository);
	}
	
	@RequestMapping("/getAdminPg/{id}")
	public Pg getByPgId(@PathVariable String id) {
		return this.pgExImpl.getByPgId(pgRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeAdminPg/{id}")
	public String removePgId(@PathVariable String id) {
		if(id!=null) {
			return this.pgExImpl.removePgId(pgRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	
	@RequestMapping("/getAdminRoom/{id}")
	public Room getRoom(@PathVariable String id) {
		return this.roomExImpl.getRoomById(roomRepository, Integer.parseInt(id));
	}
	@RequestMapping("/showAdminRoom")
	public List<Room> listRoom(){
		return this.roomExImpl.getRoom(roomRepository);
	}
	@DeleteMapping("/removeAdminRoom/{id}")
	public String removeRoom(@PathVariable String id) {
		if(id!=null) {
			return this.roomExImpl.removeRoomById(roomRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
}
