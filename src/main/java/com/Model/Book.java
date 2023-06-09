package com.Model;

public class Book {
	
	//Creating private data members
	private int bookid;
	private String bookname;
	private int bookprice;
	
	//Creating Default constructor
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Creating Parameterized Constructor
	public Book(int bookid, String bookname, int bookprice){
		super();
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public int getBookprice() {
		return bookprice;
	}


	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	
	
	
	
	
	

	
}
