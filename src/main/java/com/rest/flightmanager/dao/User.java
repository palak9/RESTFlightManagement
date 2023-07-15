package com.rest.flightmanager.dao;

import javax.persistence.Column;
import javax.persistence.Id;

public class User {
	
	@Id
	@Column
	private String user_emailid;
	
	@Column
	private String user_name;
	
	@Column
	private String mobile;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String user_emailid, String user_name, String mobile) {
		super();
		this.user_emailid = user_emailid;
		this.user_name = user_name;
		this.mobile = mobile;
	}

	public String getUser_emailid() {
		return user_emailid;
	}

	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [user_emailid=" + user_emailid + ", user_name=" + user_name + ", mobile=" + mobile + "]";
	}
	
}
