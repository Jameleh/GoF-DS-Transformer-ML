package org.example;
import java.util.*;

public class ConcreteList <E> implements Aggregate<E>{
    private List<E> list = new ArrayList<>();

    public void add(E item){
        list.add(item);
    }

    @Override
    public Iterator<E> createIterator() {
        return new ListIterator<>(list);
    }
}
