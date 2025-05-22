package com.mycompany.decorator;

public abstract class AdicionarDecorator implements Bebida {
    protected Bebida bebida;
    
    public AdicionarDecorator(Bebida bebida){
        this.bebida = bebida;
    }
    
    public abstract String getDescricao();
    
}
