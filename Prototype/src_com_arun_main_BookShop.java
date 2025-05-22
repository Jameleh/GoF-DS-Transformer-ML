package com.arun.main;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String bookShopName;
	
	List<Book> books=new ArrayList<>();

	public String getBookShopName() {
		return bookShopName;
	}

	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", books=" + books + "]";
	}
	
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book b=new Book();
			b.setBookId(i);
			b.setBookName("Book "+i);
			books.add(b);
		}
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop shop=new BookShop();
		
		for(Book b:this.books)
		{
			shop.books.add(b);
		}
		return shop;

	}
	
	
	
	

}
