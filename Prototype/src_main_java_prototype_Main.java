package main.java.prototype;

public class Main {

    public static void main(String[] args) {

        var aungNet = new Dog();
        var goatKyar=aungNet.cloneObj();
        System.out.println(aungNet.equals(goatKyar));

    }
}
