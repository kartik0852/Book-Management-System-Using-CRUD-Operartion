package com.Database;

import java.sql.SQLException;

import com.Model.Emp;

public interface EmpDao {
	
	
	//Creating methods in interface so we can override this methods in another class using implementation
	public Emp register(Emp e) throws SQLException;
	public Emp login(String em,String pwd) throws SQLException;
}
