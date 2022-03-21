package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SEAT_MAPPING")
public class SeatMapping {
	@Id
	private int seat_Id;
	private int seatNo;
	private int booking_Id;
	
	@ManyToOne
	@JoinColumn(name="booking_Id")
	private Booking booking;

	public SeatMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSeat_Id() {
		return seat_Id;
	}

	public void setSeat_Id(int seat_Id) {
		this.seat_Id = seat_Id;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatMapping(int seat_Id, int seatNo, int booking_Id, Booking booking) {
		super();
		this.seat_Id = seat_Id;
		this.seatNo = seatNo;
		this.booking_Id = booking_Id;
		this.booking = booking;
	}

}
