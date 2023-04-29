package com.Model;

public class User {

	//Creating private data members
	private String username;
	private String pwd;
	
	//Creating Constructor
	public User(String username, String pwd) {
		super();
		this.username=username;
		this.pwd=pwd;
	}

	//Creating getter and setter of private data members
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	//Creating toString method
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + "]";
	}

}
