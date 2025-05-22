package emineozbek.com.mementodesignpattern;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Memento {

    private int productId;
    private String productName;
    private BigDecimal listPrice;

    public Memento(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

}
