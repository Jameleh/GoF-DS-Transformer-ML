package com.design.caretaker;

import java.util.ArrayList;
import java.util.List;

import com.design.memento.Memento;

public class CareTaker {
	// # declare memento list
	private List<Memento> mementoList = new ArrayList<>();
	
	// # get data from memento data list
	public Memento getFromMemento(final int index) {
		return mementoList.get(index);
	}
	
	// # add to memento data list
	public void addToMemento(Memento memento) {
		mementoList.add(memento);
	}
}
