package builder;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroBuilder implements ICarroBuilder {

    private String modelo;
    private String cor;
    private String motor;
    private List<String> acessorios = new ArrayList<>();
    private String combustivel;
    private int portas;
    private int ano;
    private boolean sistemaDeNavegacao;


    @Override
    public ICarroBuilder modelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    @Override
    public ICarroBuilder cor(String cor){
        this.cor = cor;
        return this;
    }

    @Override
    public ICarroBuilder motor(String motor){
        this.motor = motor;
        return this;
    }

    @Override
    public ICarroBuilder adicionarAcessorios(String acessorios){
        this.acessorios.add(acessorios);
        return this;
    }

    @Override
    public ICarroBuilder  combustivel(String combustivel){
        this.combustivel = combustivel;
        return this;
    }

    @Override
    public ICarroBuilder portas(Integer portas){
        this.portas = portas;
        return this;
    }

    @Override
    public ICarroBuilder ano (Integer ano){
        this.ano = ano;
        return this;
    }

    @Override
    public ICarroBuilder sistemaDeNavegacao(boolean sistemaDeNavegacao){
        this.sistemaDeNavegacao = sistemaDeNavegacao;
        return this;
    }

    @Override
    public Carro build(){

        return new Carro(modelo, cor, motor, acessorios,combustivel,portas,ano, sistemaDeNavegacao);

        //Carro carro =  new Carro(modelo, cor, motor, acessorios,combustivel,portas,ano, sistemaDeNavegacao);
        //this.reset();
        //return carro;
    }

    private void reset(){
        this.modelo = null;
        this.cor = null;
        this.motor = null;
        this.acessorios = new ArrayList<>();
        this.combustivel = null;
        this.portas = 0;
        this.ano = 0;
        this.sistemaDeNavegacao = false;
    }



}
