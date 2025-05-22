package org.example.controller;

import org.example.model.Automovel;

public class Loja {
    public static void main(String[] args) throws CloneNotSupportedException {
        Automovel a = new Automovel(); // Criamos um objeto do tipo Automóvel
        a.setMarca("Chevrolet"); //Definimos o valor de seus atributos
        a.setModelo("Celta");
        a.setTipo("Passeio");
        System.out.println("Marca: "+ a.getMarca() + " Modelo: "+ a.getModelo() + " Tipo: "+ a.getTipo()); //Printamos na tela o valor do objeto automóvel a.

        Automovel b = a.clone(); //Chamamos o método clone da classe Automovel, para que a variavel b seja um clone de a
        System.out.println("Marca: "+ b.getMarca()); //printamos na tela a marca.

        b.setModelo("Montana");// definimos um modelo diferente para o objeto b
        System.out.println("Marca: "+ b.getMarca() + " Modelo: "+ b.getModelo() + " Tipo: "+ b.getTipo()); //printamos na tela os valores do objeto b.

    }
}
