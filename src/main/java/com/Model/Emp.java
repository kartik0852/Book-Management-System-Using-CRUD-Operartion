package com.Model;

public class Emp {
	
	//Creating data members
	private String empname;
	private String pwd;
	
	//Creating constructor
	public Emp(String empname, String pwd) {
		super();
		this.empname=empname;
		this.pwd=pwd;
	}

	
	//Creating Getter and Setter for private data members
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//Creating toString
	@Override
	public String toString() {
		return "Employe [empname=" + empname + ", pwd=" + pwd + "]";
	}


}
