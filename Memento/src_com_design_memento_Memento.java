package com.design.memento;

public class Memento {
	// # declare state
	private String state;
	
	// # set state
	public Memento(final String state) {
		this.state = state;
	}
	
	// # get state
	public String getState() {
		return state;
	}
}
