package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passengers")
public class Passengers {

	@Id
	@GeneratedValue
	private int passengerId;
	
    private String name;
    private int seatNo;
    private String gender;
    private int age;
    
    @ManyToOne
    @JoinColumn(name="user_Id")
    private User user;

	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passengers(int passengerId, String name, int seatNo, String gender, int age, User user) {
		super();
		this.passengerId = passengerId;
		this.name = name;
		this.seatNo = seatNo;
		this.gender = gender;
		this.age = age;
		this.user = user;
	}
    
    

	

}