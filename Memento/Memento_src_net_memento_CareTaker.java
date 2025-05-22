package net.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);	
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
	
	public void showList() {
		System.out.print("List state: ");
		for(Memento a : mementoList )
			System.out.println(a + " ,");
	}
}
