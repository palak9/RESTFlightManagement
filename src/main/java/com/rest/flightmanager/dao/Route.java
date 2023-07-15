package com.rest.flightmanager.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int route_id;
	
	@Column
	private String from_location;
	
	@Column
	private String to_location;

	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Route(int route_id, String from_location, String to_location) {
		super();
		this.route_id = route_id;
		this.from_location = from_location;
		this.to_location = to_location;
	}

	public int getRoute_id() {
		return route_id;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public String getFrom_location() {
		return from_location;
	}

	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}

	public String getTo_location() {
		return to_location;
	}

	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}

	@Override
	public String toString() {
		return "Route [route_id=" + route_id + ", from_location=" + from_location + ", to_location=" + to_location
				+ "]";
	}
	
}