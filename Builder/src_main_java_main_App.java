package main;

import builder.CarroBuilder;
import builder.ICarroBuilder;
import model.Carro;


public class App {

    public static void main(String[] args) {

        ICarroBuilder builder = new CarroBuilder();

        Carro carro1 = builder
                .modelo("Bmw X6 ")
                .cor("Branca")
                .motor("v6")
                .combustivel("Gasolina")
                .portas(4)
                .ano(2019)
                .sistemaDeNavegacao(true)
                .adicionarAcessorios("Banco de couro")
                .build();

        Carro carro2 = builder
                .modelo("SUV X")
                .cor("Preto")
                .motor("V6")
                .combustivel("Flex")
                .portas(4)
                .ano(2024)
                .sistemaDeNavegacao(true)
                .adicionarAcessorios("Teto solar")
                .adicionarAcessorios("Banco de Couro")
                .build();



        System.out.println(carro1);
        System.out.println(carro2);
    }
}
