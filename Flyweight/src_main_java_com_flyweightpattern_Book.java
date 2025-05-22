package com.flyweightpattern;

public class Book {

    private String name;
    private double price;
    private BookType type;
    
    public Book(String name, double price, BookType booktype) {
    	this.name = name;
    	this.price = price;
    	this.type = booktype;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
    
	public String toString() {
		return "Book{"+
				"name='"+name+'\''+
				",price='"+price+'\''+
				",BookType='"+type+'\''+
				'}';
	}

}