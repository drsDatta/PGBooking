package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.RoomRepository;
import com.project.dao.UserRepository;
import com.project.entities.Room;
import com.project.entities.User;
@Service
public class RoomExImpl implements RoomExService{
	Room oldRoom;
	List<Room>rlist;
	@Autowired
	RoomRepository roomRepository;
	private RoomExImpl() {
		rlist=new ArrayList<>();
	}
	@Override
	public Room setRoom(RoomRepository roomRepository, Room room) {
		roomRepository.save(room);
		return room;
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

	@Override
	public Room updateRoom(RoomRepository roomRepository, Room room, int id) {
		Optional<Room>op=roomRepository.findById(id);
		try{
			oldRoom=op.get();
		oldRoom.setType(room.getType());
		oldRoom.setNo_of_bed(room.getNo_of_bed());
		oldRoom.setImage(room.getImage());
		oldRoom.setNo_of_guest(room.getNo_of_guest());
		oldRoom.setSize(room.getSize());
		oldRoom.setRent(room.getRent());
		oldRoom.setStatus(room.getStatus());
		roomRepository.save(oldRoom);
		}catch(Exception e){
			System.err.println("no object found"+e);
		}
		return oldRoom;
	}

}
