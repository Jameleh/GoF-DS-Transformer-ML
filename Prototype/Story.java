package PrototypeDesignPattern;

public class Story extends Book {


    private int Agelimit;

    public int getAgelimit() {
        return Agelimit;
    }

    public void setAgelimit(int agelimit) {
        this.Agelimit = agelimit;
    }

    @Override
    public String toString() {
        return "Story{" +
                 "Agelimit=" +Agelimit+
                  '}';
}
}