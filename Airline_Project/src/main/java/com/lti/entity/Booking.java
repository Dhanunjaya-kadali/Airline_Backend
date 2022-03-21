package com.lti.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKINGS")
public class Booking {

	@Id
	private int booking_Id;
	private Date booking_time;
	private double booking_amount;
	private int schedule_id;
	

	@ManyToOne
	@JoinColumn(name="flight_Id")
	private Flight flight;
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User users;
	
	@OneToOne
	@JoinColumn(name="payment_Id")
	private Payment payment;
	
	@OneToMany(mappedBy ="seat_Id")
	private List<SeatMapping> seatmappings;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}

	public Date getBooking_time() {
		return booking_time;
	}

	public void setBooking_time(Date booking_time) {
		this.booking_time = booking_time;
	}

	public double getBooking_amount() {
		return booking_amount;
	}

	public void setBooking_amount(double booking_amount) {
		this.booking_amount = booking_amount;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<SeatMapping> getSeatmappings() {
		return seatmappings;
	}

	public void setSeatmappings(List<SeatMapping> seatmappings) {
		this.seatmappings = seatmappings;
	}

	public Booking(int booking_Id, Date booking_time, double booking_amount, int schedule_id, Flight flight, User users,
			Payment payment, List<SeatMapping> seatmappings) {
		super();
		this.booking_Id = booking_Id;
		this.booking_time = booking_time;
		this.booking_amount = booking_amount;
		this.schedule_id = schedule_id;
		this.flight = flight;
		this.users = users;
		this.payment = payment;
		this.seatmappings = seatmappings;
	}
	
	
	
	
	


}
