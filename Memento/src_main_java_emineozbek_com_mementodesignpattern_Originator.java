package emineozbek.com.mementodesignpattern;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Originator {

    private int productId;
    private String productName;
    private BigDecimal listPrice;

    public Memento saveListPriceToMemento() {
        return new Memento(listPrice);
    }

    public void getListPriceFromMemento(Memento memento) {
        listPrice = memento.getListPrice();
    }

}
