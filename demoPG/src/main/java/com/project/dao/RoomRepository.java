package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Room;
@Repository
public interface RoomRepository extends CrudRepository<Room, Integer>{

}
