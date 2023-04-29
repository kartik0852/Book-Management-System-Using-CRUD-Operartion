package com.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.Book;

public class BookDaoImpl implements BookDao {
	String q;
	public static Connection con=null;
	public static Statement st=null;
	PreparedStatement pst = null;
	ResultSet rs=null;
	Scanner sc = new Scanner(System.in);
	
	public BookDaoImpl() throws ClassNotFoundException, SQLException{
		con=MyConnection.getConnection();
		try {
			st=con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//create a method insert a data in Book table 
	public int save(Book b) {
		q="insert into book values('"+b.getBookid()+"','"+b.getBookname()+"','"+b.getBookprice()+"')";
		int i=0;
		try {
			i = st.executeUpdate(q);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
	}


	@Override
	public void addFav(List<Book> b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Book> showBooks() {
		// TODO Auto-generated method stub
		q="select * from book";
		List<Book> bl = new ArrayList<Book>();
		try {
			rs=st.executeQuery(q);
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Price : "+rs.getInt(3));
				bl.add(new Book(rs.getInt("bookid"), rs.getString("bookname"), rs.getInt("price")));		//name same as My sql column names
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return bl;
	}
	//creating methods to add fav book in the book table	


	@Override
	public int deleteBook(Book b) {
		q="delete from book where bookid = '"+b.getBookid()+"'";
		int i =0;
		try {
			i = st.executeUpdate(q);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
	}
}
