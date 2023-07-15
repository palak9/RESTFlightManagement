package com.rest.flightmanager.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline {

	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int airline_id;
	
	@Column
	private String airline_name;
	
	@Column
	private int airline_capacity;

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(int airline_id, String airline_name, int airline_capacity) {
		super();
		this.airline_id = airline_id;
		this.airline_name = airline_name;
		this.airline_capacity = airline_capacity;
	}

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public int getAirline_capacity() {
		return airline_capacity;
	}

	public void setAirline_capacity(int airline_capacity) {
		this.airline_capacity = airline_capacity;
	}

	@Override
	public String toString() {
		return "Airline [airline_id=" + airline_id + ", airline_name=" + airline_name + ", airline_capacity="
				+ airline_capacity + "]";
	}
		
}
