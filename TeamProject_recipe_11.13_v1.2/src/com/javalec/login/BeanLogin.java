package com.javalec.login;

public class BeanLogin {

	// field

	String userid;
	String userpw;
	String username;
	String userno;
	String email;
	
	
	
	// constructor
	public BeanLogin() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public BeanLogin(String userid) {
		super();
		this.userid = userid;
	}




	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getUserpw() {
		return userpw;
	}


	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}




	public String getUserno() {
		return userno;
	}




	public void setUserno(String userno) {
		this.userno = userno;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public BeanLogin(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}




	
	
	
}
