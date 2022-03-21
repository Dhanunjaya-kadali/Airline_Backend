package com.lti.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHTS")
public class Flight {

	@Id
	@GeneratedValue
    private long flight_Id;

	private String source;
    private String destination;
    private int depar_time;
    private int arrival_time;
    private int total_seats;
    private int duration;
    private int cabin;

	@ManyToOne
	@JoinColumn(name = "admin")
	private Admin admin;

	@OneToMany(mappedBy = "user")
	private List<User> users;

	@OneToMany(mappedBy = "booking")
	private List<Booking> booking;
	
	@OneToOne
	@JoinColumn(name="schedule_id")
	private Flight_Schedule flightshedule;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getFlight_Id() {
		return flight_Id;
	}

	public void setFlight_Id(long flight_Id) {
		this.flight_Id = flight_Id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDepar_time() {
		return depar_time;
	}

	public void setDepar_time(int depar_time) {
		this.depar_time = depar_time;
	}

	public int getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCabin() {
		return cabin;
	}

	public void setCabin(int cabin) {
		this.cabin = cabin;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public Flight_Schedule getFlightshedule() {
		return flightshedule;
	}

	public void setFlightshedule(Flight_Schedule flightshedule) {
		this.flightshedule = flightshedule;
	}

	public Flight(long flight_Id, String source, String destination, int depar_time, int arrival_time, int total_seats,
			int duration, int cabin, Admin admin, List<User> users, List<Booking> booking,
			Flight_Schedule flightshedule) {
		super();
		this.flight_Id = flight_Id;
		this.source = source;
		this.destination = destination;
		this.depar_time = depar_time;
		this.arrival_time = arrival_time;
		this.total_seats = total_seats;
		this.duration = duration;
		this.cabin = cabin;
		this.admin = admin;
		this.users = users;
		this.booking = booking;
		this.flightshedule = flightshedule;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}