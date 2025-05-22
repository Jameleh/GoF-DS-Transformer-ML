package frase.impl;

import frase.interfaces.iObservador;

public class Observador implements iObservador
{
    int id;

    public Observador(int id)
    {
        this.id = id;
    }

    @Override
    public void update(Observavel frase)
    {
        System.out.println("Cliente: "+this.id);
        System.out.println("Frase: " + frase.getFrase());
        System.out.println("Quantidade de palavras: " + frase.getNumPalavras());
//        System.out.println("Palavras com quantidades pares de caracteres: " + frase.getPalavrasPares());
//        System.out.println("Palavras começadas com maiúsculas: " + frase.getPalavrasMaiusculas());
    }
}
