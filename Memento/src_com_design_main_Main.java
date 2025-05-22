package com.design.main;

import com.design.caretaker.CareTaker;
import com.design.originator.Originator;

public class Main {
	public static void main(String[] args) {
		System.out.println("# Memento Design Pattern");
		
		// # declare CareTaker and Originator
		final CareTaker careTaker = new CareTaker();
		final Originator originator = new Originator();
		
		// # add 1st state of the design pattern
		originator.setState("1st_State");
		// # add to list
		careTaker.addToMemento(originator.storeStateToMemento());
		
		// # add 2nd and 3rd state of the design pattern
		originator.setState("2nd_State");
		originator.setState("3rd_State");
		
		// # store all the values in the list
		careTaker.addToMemento(originator.storeStateToMemento());

		// # add final stage to the design pattern
		originator.setState("Final_State");
		// # print final stage of the design pattern
		System.out.println("Current state is: " + originator.getState());
		
		// # fetch 1st state of the design pattern
		originator.restoreStateFromMemento(careTaker.getFromMemento(0));
		// # print 1st state of the design pattern
		System.out.println("1st saved state is: " + originator.getState());
		
		// # fetch 2nd state of the design pattern
		originator.restoreStateFromMemento(careTaker.getFromMemento(1));
		// # print 2nd state of the design pattern
		System.out.println("2nd saved state is: " + originator.getState());
	}
}
