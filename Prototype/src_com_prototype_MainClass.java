package com.prototype;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		  
   BookShop bs = new BookShop();
   
   bs.setBsname("HM");
   bs.load();
   System.out.println(bs);
   
   BookShop bs1 = bs.clone();
   bs.getBsbooks().remove(2);
   System.out.println(bs);
   bs1.setBsname("Hello");
   System.out.println(bs1);
		
		
	}

}
