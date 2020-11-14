package com.javalec.mypageEdition;

public class BeanEdition {
	
	//field
	String pwUser;
	String name;
	String userid;
	String email;
	
	
	//constructor
	public BeanEdition() {
		// TODO Auto-generated constructor stub
	}

	public BeanEdition(String pwUser, String email) {
		super();
		this.pwUser = pwUser;
		this.email = email;
	}
	

	public BeanEdition(String name, String userid, String email) {
		super();
		this.name = name;
		this.userid = userid;
		this.email = email;
	}
	

	public BeanEdition(String userid) {
		super();
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPwUser(String pwUser) {
		this.pwUser = pwUser;
	}

	public String getPwUser() {
		return pwUser;
	}

	public void setPw(String pwUser) {
		this.pwUser = pwUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//method
	
}
