package br.com.mferreira.factory;

public abstract class  AbstractFactory {
    public Carro criarCarro(String requestedGrade){
        return retrieveCarro(requestedGrade);
    }

    public Concessionaria criarConcessionaria(String requestedGrade){
        return  retrieveConcessioanria(requestedGrade);
    }


    abstract Carro retrieveCarro(String requestedGrade);
    abstract Concessionaria retrieveConcessioanria(String requestedGrade);


}

