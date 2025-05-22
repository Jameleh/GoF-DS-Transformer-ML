package com.mycompany.decorator;

public class Decorator {

    public static void main(String[] args) {
        Bebida pedido = new Café();
        pedido = new Leite(pedido);
        pedido = new Chocolate(pedido);
        
        System.out.println("Descrição" + pedido.getDescricao());
        System.out.println("Preço" + pedido.getPreco());
    }
}
