package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue
	private int user_Id;
	private String user_Fname;
	private String user_Lname;
	private int user_age;
	private String user_gender;
	private String user_email;
	private String user_address;
	private String user_password;
	private int flight_no;

	@OneToMany(mappedBy= "passenger")
	private List<Passengers> passenger;
	
	@ManyToOne
	@JoinColumn(name="flight_Id")
	private Flight flights;
	
	@OneToMany(mappedBy="booking")
	private Booking booking;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Fname() {
		return user_Fname;
	}

	public void setUser_Fname(String user_Fname) {
		this.user_Fname = user_Fname;
	}

	public String getUser_Lname() {
		return user_Lname;
	}

	public void setUser_Lname(String user_Lname) {
		this.user_Lname = user_Lname;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public List<Passengers> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passengers> passenger) {
		this.passenger = passenger;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public User(int user_Id, String user_Fname, String user_Lname, int user_age, String user_gender, String user_email,
			String user_address, String user_password, int flight_no, List<Passengers> passenger, Flight flights,
			Booking booking) {
		super();
		this.user_Id = user_Id;
		this.user_Fname = user_Fname;
		this.user_Lname = user_Lname;
		this.user_age = user_age;
		this.user_gender = user_gender;
		this.user_email = user_email;
		this.user_address = user_address;
		this.user_password = user_password;
		this.flight_no = flight_no;
		this.passenger = passenger;
		this.flights = flights;
		this.booking = booking;
	}

	
	
	
}