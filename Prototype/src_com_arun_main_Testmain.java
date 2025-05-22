package com.arun.main;

public class Testmain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs1=new BookShop();
		bs1.setBookShopName("Arun");
		bs1.loadData();
		System.out.println(bs1);
		
		
		BookShop bs2=bs1.clone();
		bs2.setBookShopName("Amballa");
		
		bs1.books.remove(3);
		System.out.println(bs1);
		System.out.println(bs2);
		
	}

}
