package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class AdminExImpl implements AdminExService{
	List<Admin>alist;
	List<User>ulist;
	List<Owner>oList;
	List<Booking>blist;
	List<Facility>faclist;
	List<Pg>pglist;
	List<Room>rlist;
	Admin oldAdmin;
	
	@Autowired
	AdminRepository adminRepository;
	Owner oldOwner;
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	FacilityRepository facilityRepository;
	@Autowired
	PgRepository pgRepository;
	@Autowired
	RoomRepository roomRepository;
	public AdminExImpl() {
		alist=new ArrayList<>();
		ulist=new ArrayList<>();
		oList=new ArrayList<>();
		blist=new ArrayList<>();
		faclist=new ArrayList<>();
		pglist=new ArrayList<>();
		rlist=new ArrayList<>();
	}
	@Override
	public Admin setAdmin(AdminRepository adminRepository, Admin admin) {
		adminRepository.save(admin);
		return admin;
	}
	@Override
	public Admin searchAdmin(AdminRepository adminRepository, int id) {
		// TODO Auto-generated method stub
		Optional<Admin>op=adminRepository.findById(id);
		Admin admin=op.get();
		return admin;
	}
	@Override
	public String removeAdmin(AdminRepository adminRepository, int id) {
		adminRepository.deleteById(id);
		return "Deleted";
	}
	@Override
	public List<Admin> showAdmin(AdminRepository adminRepository) {
		Iterable<Admin> it=adminRepository.findAll();
		Iterator<Admin> itr=it.iterator();
		while(itr.hasNext()) {
			Admin admin=itr.next();
			alist.add(admin);
		}
		return alist;
	}
	@Override
	public Admin updateAdmin(AdminRepository adminRepository, Admin newAdmin, int id) {
		Optional<Admin>op=adminRepository.findById(id);
		try {
		oldAdmin=op.get();
		oldAdmin.setEmail(newAdmin.getEmail());
		oldAdmin.setPassword(newAdmin.getPassword());
		adminRepository.save(oldAdmin);
		}catch(Exception e) {
			System.err.println("error"+e);
		}
		return oldAdmin;
	}
	@Override
	public List<User> getUser(UserRepository userRepository) {
		Iterable<User>itr=userRepository.findAll();
		Iterator<User>it=itr.iterator();
		while(it.hasNext()) {
			User user=it.next();
			ulist.add(user);
		}
		return ulist;
	}
	@Override
	public User getById(UserRepository userRepository, int id) {
		Optional<User>op=userRepository.findById(id);
		User user=op.get();
		return user;
	}
	@Override
	public String removeId(UserRepository userRepository, int id) {
		userRepository.deleteById(id);
		return "deleted";
	}
	@Override
	public List<Owner> showOwner(OwnerRepository ownerRepository) {
		Iterable<Owner> it=ownerRepository.findAll();
		Iterator<Owner>itr=it.iterator();
		while(itr.hasNext()) {
			Owner owner=itr.next();
			oList.add(owner);
		}
		return oList;
	}

	@Override
	public Owner searchOwner(OwnerRepository ownerRepository, int id) {
		Optional<Owner>op=ownerRepository.findById(id);
		Owner owner=op.get();
		return owner;
	}

	@Override
	public String deletOwner(OwnerRepository ownerRepository, int id) {
		ownerRepository.deleteById(id);
		return "deleted";
	}
	@Override
	public List<Booking> showBooking(BookingRepository bookingRepository) {
		Iterable<Booking>itr=bookingRepository.findAll();
		Iterator<Booking>it=itr.iterator();
		while(it.hasNext()) {
			Booking booking=it.next();
			blist.add(booking);
		}
		return blist;
	}
	@Override
	public List<Facility> getFacility(FacilityRepository facilityRepository) {
		Iterable<Facility>itr=facilityRepository.findAll();
		Iterator<Facility>it=itr.iterator();
		while(it.hasNext()) {
			Facility facility=it.next();
			faclist.add(facility);
		}
		return faclist;
	}

	@Override
	public Facility getFacilityById(FacilityRepository facilityRepository, int id) {
		Optional<Facility>op=facilityRepository.findById(id);
		Facility facility=op.get();
		return facility;
	}
	@Override
	public String removeFacilityById(FacilityRepository facilityRepository, int id) {
		facilityRepository.deleteById(id);
		return "deleted";
	}


	@Override
	public List<Pg> getPg(PgRepository pgRepository) {
		Iterable<Pg>itr=pgRepository.findAll();
		Iterator<Pg>it=itr.iterator();
		while(it.hasNext()) {
			Pg pg=it.next();
			pglist.add(pg);
		}
		return pglist;
	}

	@Override
	public Pg getByPgId(PgRepository pgRepository, int id) {
		Optional<Pg>op=pgRepository.findById(id);
		Pg pg=op.get();
		return pg;
	}

	@Override
	public String removePgId(PgRepository pgRepository, int id) {
		pgRepository.deleteById(id);
		return "deleted";
	}
	
	@Override
	public List<Room> getRoom(RoomRepository roomRepository) {
		Iterable<Room>itr=roomRepository.findAll();
		Iterator<Room>it=itr.iterator();
		while(it.hasNext()) {
			Room room=it.next();
			rlist.add(room);
		}
		return rlist;
	}

	@Override
	public Room getRoomById(RoomRepository roomRepository, int id) {
		Optional<Room>op=roomRepository.findById(id);
		Room room=op.get();
		return room;
	}

	@Override
	public String removeRoomById(RoomRepository roomRepository, int id) {
		roomRepository.deleteById(id);
		return "deleted";
	}
	
}
