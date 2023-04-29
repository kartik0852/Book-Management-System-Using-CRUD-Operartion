package com.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.Model.User;

public class UserDataBase {
	
	Scanner sc = new Scanner(System.in);
	
	static Statement st=null;
	static String q;
	
	//Creating constructor
	public UserDataBase() throws SQLException {
		Connection con = MyConnection.getConnection();
		st=con.createStatement();
	}
	
	//Create a method addUser, it add the data of user in the data base
	public void addUser(User u) throws SQLException{
		q="insert into emp values('"+u.getUsername()+"','"+u.getPwd()+"')";
		int i = st.executeUpdate(q);
		System.out.println(q);
	}
	
	
	//Create a method deleteUser, it delete the user data from the table
	public void deleteUser(User u) throws Exception {
		q="delete from emp where empname = ('"+sc.next()+"')";
		int i= st.executeUpdate(q);
		System.out.println(i);
	}

}
