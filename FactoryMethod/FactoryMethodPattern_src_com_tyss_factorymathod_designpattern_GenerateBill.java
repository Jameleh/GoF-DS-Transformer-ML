package com.tyss.factorymathod.designpattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		 GetPlanFactory planFactory = new GetPlanFactory();  
	        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	    //  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      Scanner scan = new  Scanner(System.in);
	  
	      String planName=scan.nextLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=scan.nextInt();  
	  
	      Plan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            } 

	


}

