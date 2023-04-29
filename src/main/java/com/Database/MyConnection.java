package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/weuscode";
	private static Connection con = null;
	
	//Creating constructor
	private MyConnection()throws SQLException{
		
	}
	
	
	//Create getConnection method
	public static Connection getConnection()throws SQLException{
		if(con == null) {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,"root","root");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}

}
