package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.RoomRepository;
import com.project.dao.UserRepository;
import com.project.entities.Room;
import com.project.entities.User;
import com.project.service.RoomExImpl;
import com.project.service.UserExImpl;

@RestController
public class RoomController {
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomExImpl roomExImpl;
	@RequestMapping("/showRoom")
	public List<Room> listRoom(){
		return this.roomExImpl.getRoom(roomRepository);
	}
	@PostMapping("/setRoom")
	public Room setRoom(@RequestBody Room room) {
		return this.roomExImpl.setRoom(roomRepository, room);
	}
	@RequestMapping("/getRoom/{id}")
	public Room getRoom(@PathVariable String id) {
		return this.roomExImpl.getRoomById(roomRepository, Integer.parseInt(id));
	}
	@DeleteMapping("/removeRoom/{id}")
	public String removeRoom(@PathVariable String id) {
		if(id!=null) {
			return this.roomExImpl.removeRoomById(roomRepository, Integer.parseInt(id));
		}else {
			return "null value";
		}
	}
	@PutMapping("/updateRoom/{id}")
	public Room updateRoom(@RequestBody Room room,@PathVariable String id) {
		return this.roomExImpl.updateRoom(roomRepository,room, Integer.parseInt(id));
	}
}
