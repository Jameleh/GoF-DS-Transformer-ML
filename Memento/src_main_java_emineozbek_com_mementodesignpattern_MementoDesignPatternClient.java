package emineozbek.com.mementodesignpattern;

import java.math.BigDecimal;

public class MementoDesignPatternClient {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setListPrice(BigDecimal.valueOf(27.59));
        careTaker.add(originator.saveListPriceToMemento());

        originator.setListPrice(BigDecimal.valueOf(33.69));
        careTaker.add(originator.saveListPriceToMemento());

        originator.setListPrice(BigDecimal.valueOf(42.99));
        System.out.println("Ürünün liste fiyatı: " + originator.getListPrice());

        originator.getListPriceFromMemento(careTaker.get(0));
        System.out.println("Ürünün ilk liste fiyatı: " + originator.getListPrice());

        originator.getListPriceFromMemento(careTaker.get(1));
        System.out.println("Ürünün ikinci liste fiyatı: " + originator.getListPrice());

    }
}
