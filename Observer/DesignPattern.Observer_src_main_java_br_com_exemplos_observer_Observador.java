package br.com.exemplos.observer;

import br.com.exemplos.dominio.Investimento;

public class Observador implements IObservador {

    private String nome;

    public String getNome() {
        return this.nome;

    }

    public Observador(String nome) {
        this.nome = nome;
    }

    public void notificar(Investimento investimento) {
        System.out.println("Notificando " + this.getNome() + " que " + investimento.simbolo
                + " teve prešo alterado para " + investimento.getValor());
    }

}
