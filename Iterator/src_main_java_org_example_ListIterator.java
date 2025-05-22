package org.example;
import java.util.*;

public class ListIterator<E> implements Iterator<E>{
    List<E> list;
    int position;

    ListIterator(List<E> list){
        this.list=list;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public E next() {
        return hasNext()==true?list.get(position++):null;
    }
}
