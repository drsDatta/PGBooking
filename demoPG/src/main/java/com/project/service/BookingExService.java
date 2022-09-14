package com.project.service;

import java.util.List;

import com.project.dao.BookingRepository;
import com.project.entities.Booking;

public interface BookingExService {
	public Booking booking(BookingRepository bookingRepository,Booking booking);
	public Booking updateBooking(BookingRepository bookingRepository ,Booking booking,int id);
	public String deleteBooking(BookingRepository bookingRepository,int id);
	public List<Booking> showBooking(BookingRepository bookingRepository);
}
