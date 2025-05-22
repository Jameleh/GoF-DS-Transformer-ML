package com.mycompany.decorator;

public class Café implements Bebida{

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 4.00;
    }
    
}
