package com.lti.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT_SCHEDULE")
public class Flight_Schedule {
	@Id
	@GeneratedValue
	private int schedule_id;
	
	private LocalDate schedule_date;
	private LocalTime schedule_time;
	private int sets_avail;
	private String flight_no;
	
	@OneToOne
	@JoinColumn(name="flight_Id")
	private Flight flights;

	public Flight_Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public LocalDate getSchedule_date() {
		return schedule_date;
	}

	public void setSchedule_date(LocalDate schedule_date) {
		this.schedule_date = schedule_date;
	}

	public LocalTime getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(LocalTime schedule_time) {
		this.schedule_time = schedule_time;
	}

	public int getSets_avail() {
		return sets_avail;
	}

	public void setSets_avail(int sets_avail) {
		this.sets_avail = sets_avail;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}

	public Flight_Schedule(int schedule_id, LocalDate schedule_date, LocalTime schedule_time, int sets_avail,
			String flight_no, Flight flights) {
		super();
		this.schedule_id = schedule_id;
		this.schedule_date = schedule_date;
		this.schedule_time = schedule_time;
		this.sets_avail = sets_avail;
		this.flight_no = flight_no;
		this.flights = flights;
	}
	
	

}