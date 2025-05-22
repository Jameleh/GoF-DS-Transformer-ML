package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {

		BookShop shop = new BookShop();
		for(Book b : this.getBsbooks())
		{
			shop.getBsbooks().add(b);
		}
			
		return shop;
	}

	private String bsname;
	private List<Book> bsbooks = new ArrayList<>();
	
	public String getBsname() {
		return bsname;
	}
	public void setBsname(String bsname) {
		this.bsname = bsname;
	}
	public List<Book> getBsbooks() {
		return bsbooks;
	}
	public void setBsbooks(List<Book> bsbooks) {
		this.bsbooks = bsbooks;
	}
	
	public void load()
	{
		for(int i=0;i<=10;i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book " + i);
		    getBsbooks().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [bsname=" + bsname + ", bsbooks=" + bsbooks + "]";
	}
	
	

}
