package com.mycompany.decorator;

public class Leite extends AdicionarDecorator{

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
    
}
