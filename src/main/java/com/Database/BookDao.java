package com.Database;

import java.util.List;

import com.Model.Book;

public interface BookDao {
	public int save(Book b);
	public void addFav(List<Book>b);
	public List<Book> showBooks();
	public int deleteBook(Book b);
}
