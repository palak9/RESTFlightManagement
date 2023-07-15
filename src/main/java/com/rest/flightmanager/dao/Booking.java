package com.rest.flightmanager.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Booking {

	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int booking_id;
	
	@Column
	private String user_emailid;
	
	@Column
	private int flight_id;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int booking_id, String user_emailid, int flight_id) {
		super();
		this.booking_id = booking_id;
		this.user_emailid = user_emailid;
		this.flight_id = flight_id;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getUser_emailid() {
		return user_emailid;
	}

	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", user_emailid=" + user_emailid + ", flight_id=" + flight_id
				+ "]";
	}
	
	
}
