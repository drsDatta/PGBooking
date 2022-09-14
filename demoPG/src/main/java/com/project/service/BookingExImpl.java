package com.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BookingRepository;
import com.project.entities.Booking;
import com.project.entities.User;

@Service
public class BookingExImpl implements BookingExService{
	List<Booking>blist;
	@Autowired
	BookingRepository bookingRepository;
	Booking oldBooking;
	private BookingExImpl() {
		blist=new ArrayList<>();
	}
	@Override
	public Booking booking(BookingRepository bookingRepository, Booking booking) {
		bookingRepository.save(booking);
		return booking;
	}

	@Override
	public Booking updateBooking(BookingRepository bookingRepository, Booking booking, int id) {
		Optional<Booking>op=bookingRepository.findById(id);
		try
		{
			oldBooking=op.get();
			oldBooking.setPurpose_of_visit(booking.getPurpose_of_visit());
			oldBooking.setId_proof(booking.getId_proof());
			oldBooking.setId_proof_no(booking.getId_proof_no());
			oldBooking.setChekin_date(booking.getChekin_date());
			oldBooking.setCheckout_date(booking.getCheckout_date());
			oldBooking.setBooking_price(booking.getBooking_price());
			bookingRepository.save(oldBooking);
		}catch(Exception e) {
			System.err.println("error:"+e);
		}
		return oldBooking;
	}

	@Override
	public String deleteBooking(BookingRepository bookingRepository,int id) {
		bookingRepository.deleteById(id);
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
	}
