package com.company;

import java.util.ListIterator;

public class vegetablesStock implements Container{

    public String Vegetables[] = {"Carrots", "Lettuce", "Avacados", "Bell Peppers"};

    @Override
    public Iterator getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {

        int i;


        @Override
        public boolean hasNext() {

            if(i < Vegetables.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return Vegetables[i++];
            }

            return null;
        }
    }


}
