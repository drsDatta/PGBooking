
package com.project.service;

import java.util.List;

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

public interface AdminExService {
	public Admin setAdmin(AdminRepository adminRepository,Admin admin);
	public Admin searchAdmin(AdminRepository adminRepository,int id);
	public String removeAdmin(AdminRepository adminRepository,int id);
	public List<Admin> showAdmin(AdminRepository adminRepository);
	public Admin updateAdmin(AdminRepository adminRepository,Admin newAdmin,int id);
	public List<User> getUser(UserRepository userRepository);
	public User getById(UserRepository userRepository,int id);
	public String removeId(UserRepository userRepository,int id);
	public List<Owner> showOwner(OwnerRepository ownerRepository);
	public Owner searchOwner(OwnerRepository ownerRepository,int id);
	public String deletOwner(OwnerRepository ownerRepository,int id);
	public List<Booking> showBooking(BookingRepository bookingRepository);
	public List<Facility> getFacility(FacilityRepository facilityRepository);
	public Facility getFacilityById(FacilityRepository facilityRepository,int id);
	public String removeFacilityById(FacilityRepository facilityRepository,int id);
	public List<Pg> getPg(PgRepository pgRepository);
	public Pg getByPgId(PgRepository pgRepository,int id);
	public String removePgId(PgRepository pgRepository,int id);
	public List<Room> getRoom(RoomRepository roomRepository);
	public Room getRoomById(RoomRepository roomRepository,int id);
	public String removeRoomById(RoomRepository roomRepository,int id);
}
