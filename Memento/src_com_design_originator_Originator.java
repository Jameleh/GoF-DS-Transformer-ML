package com.design.originator;

import com.design.memento.Memento;

public class Originator {
	// # declare a state
	private String state;
	
	// # store the state to Memento
	public Memento storeStateToMemento() {
		return new Memento(state);
	}
	
	// # restore the state from Memento
	public void restoreStateFromMemento(final Memento memento) {
		state = memento.getState();
	}
	
	// # get state
	public String getState() {
		return state;
	}
	
	// # set state
	public void setState(final String state) {
		this.state = state;
	}
}
