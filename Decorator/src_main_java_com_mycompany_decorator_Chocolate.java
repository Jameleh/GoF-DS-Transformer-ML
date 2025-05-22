/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author Vanderson
 */
public class Chocolate extends AdicionarDecorator{

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "Chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
    
}
