package com.project.service;

import java.util.List;

import com.project.dao.RoomRepository;
import com.project.entities.Room;

public interface RoomExService {
	public Room setRoom(RoomRepository roomRepository,Room room);
	public List<Room> getRoom(RoomRepository roomRepository);
	public Room getRoomById(RoomRepository roomRepository,int id);
	public String removeRoomById(RoomRepository roomRepository,int id);
	public Room updateRoom(RoomRepository roomRepository,Room room,int id );
}
