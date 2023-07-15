package com.rest.flightmanager.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;

@Entity
public class Flight {

	@Id
	@Column
	private int fid;
	
	@Column
	private String fname;
	
	@Column
	private int fcapacity;

	public Flight() {
		
	}

	public Flight(int fId, String fname, int fcapacity) {
		super();
		this.fid = fId;
		this.fname = fname;
		this.fcapacity = fcapacity;
	}

	public int getfId() {
		return fid;
	}

	public void setfId(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getFcapacity() {
		return fcapacity;
	}

	public void setFcapacity(int fcapacity) {
		this.fcapacity = fcapacity;
	}
}
