package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.BookingRepository;
import com.project.entities.Booking;
import com.project.service.BookingExImpl;

@RestController
public class BookingController {
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	BookingExImpl bookingExImpl;
	 
	@PostMapping("/booking")
	public Booking booking(@RequestBody Booking booking) {
		return this.bookingExImpl.booking(bookingRepository, booking);
	}
	@PutMapping("/updateBooking/{id}")
	public Booking updateBooking(@RequestBody Booking booking,@PathVariable String id) {
		return this.bookingExImpl.updateBooking(bookingRepository, booking,Integer.parseInt(id));
	}
	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable String id) {
		return this.bookingExImpl.deleteBooking(bookingRepository, Integer.parseInt(id));
	}
	@GetMapping("/showBooking")
	public List<Booking>bookingList(){
		return this.bookingExImpl.showBooking(bookingRepository);
	}
}
