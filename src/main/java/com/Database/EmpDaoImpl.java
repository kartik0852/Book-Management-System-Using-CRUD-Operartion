package com.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.Model.Emp;

public class EmpDaoImpl implements EmpDao {

	static String q;
	public static Connection con=null;
	public static Statement st=null;
	PreparedStatement pst = null;
	static ResultSet rs=null;
	static Scanner sc = new Scanner(System.in);
	
	public EmpDaoImpl() throws ClassNotFoundException, SQLException{
		con=MyConnection.getConnection();
		try {
			st=con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	@Override
	public Emp register(Emp e) throws SQLException {
		// TODO Auto-generated method stub
		q="insert into emp values('"+e.getEmpname()+"','"+e.getPwd()+"')";
		System.out.println(con+"\t Stat : "+st+" Query : "+q);
		
		int i=st.executeUpdate(q);
		if(i>0) {
			System.out.println("Udated Successfully....");
			return e;
		}
		return null;
	}

	@Override
	public Emp login(String em, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		Emp e;
		q="select * from emp where username='"+em+"' and passw='"+pwd+"'";
		rs=st.executeQuery(q);
		if(rs.next()==true) {
			e=new Emp(rs.getString(1), rs.getString(2));
			return e;
		}
		return null;
	}
	

}
