package com.lti.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {

	@Id
	@GeneratedValue
	private int transactionId;
  
	private String paymentid;
    private long totalCost;
	
	@OneToOne
	@JoinColumn(name = "booking_Id")
	private Booking booking;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public long getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(long totalCost) {
		this.totalCost = totalCost;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Payment(int transactionId, String paymentid, long totalCost, Booking booking) {
		super();
		this.transactionId = transactionId;
		this.paymentid = paymentid;
		this.totalCost = totalCost;
		this.booking = booking;
	}

	
	
}
