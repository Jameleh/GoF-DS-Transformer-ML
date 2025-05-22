package emineozbek.com.mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento listPrice) {
        mementoList.add(listPrice);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
