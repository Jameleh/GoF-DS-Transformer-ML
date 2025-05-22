package com.formationkilo;

public class Application {

	public static void main(String[] args) {
      MediatorImpl1 mediator1=new MediatorImpl1();
      ColleagueImpl1 c1=new ColleagueImpl1("A",mediator1);
      ColleagueImpl2 c2=new ColleagueImpl2("B",mediator1);
      ColleagueImpl2 c3=new ColleagueImpl2("C",mediator1);
      
      c1.sendMessage(new Message("xxxxx", "B"));
      c1.sendMessage(new Message("AAAAAA", "C"));
      c2.sendMessage(new Message("BBBBBB", "A"));
      
      System.out.println("-----------");
      System.out.println("Analysis of conversations...");
      mediator1.analyzeConversation();
   
      
	}

}
