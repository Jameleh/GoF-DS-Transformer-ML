package com.scm;

import java.util.ArrayList;
import java.util.List;

public class ListIterator<E> implements Iterator<E>{
    int position = 0;
    List<E> list;

    ListIterator(List<E> list){
        this.list = list;
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


