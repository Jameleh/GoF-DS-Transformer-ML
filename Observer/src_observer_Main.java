package observer;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();
        Binary binary = new Binary();
        Octal octal = new Octal();
        Hexa hexa = new Hexa();
        subject.setState(0);
        subject.run();

        subject.addObserver(binary);
        subject.addObserver(octal);
        subject.addObserver(hexa);
    }}

        //octal

