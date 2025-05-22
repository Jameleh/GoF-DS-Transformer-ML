package br.com.mferreira.factory;

public abstract class Concessionaria {
    private String endereco;
    private String paisOrigem;

    public Concessionaria(String endereco, String paisOrigem) {
        this.endereco = endereco;
        this.paisOrigem = paisOrigem;
    }

    public void iniciarConcessionaria(){
        System.out.println("Concessionaria Criada. O endereço é "+ endereco +
                " E o país de origem é "+ paisOrigem + " e a concessionaria é "+ getClass().getSimpleName());
    }
}
