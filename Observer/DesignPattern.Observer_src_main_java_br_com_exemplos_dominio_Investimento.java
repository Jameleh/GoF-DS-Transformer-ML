package br.com.exemplos.dominio;

import java.util.ArrayList;
import java.util.List;

import br.com.exemplos.observer.IObservador;

public abstract class Investimento {

    private double valor;
    private List<IObservador> observadores = new ArrayList<IObservador>();
    public String simbolo;

    protected Investimento(String simbolo, double valor) {
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double value) {
        {
            if (valor == value) {
                return;
            }

            valor = value;
            notificar();
        }

    }

    public void subscribe(IObservador observador) {
        observadores.add(observador);
        System.out.println("Notificando que {observador.Nome} est· recebendo atualiz„Áıes de {simbolo}");
    }

    public void UnSubscribe(IObservador observador) {
        observadores.remove(observador);
        System.out.println("Notificando que {observador.Nome} N√O est· recebendo atualiz„Áıes de {simbolo}");
    }

    private void notificar() {
        for (var investor : observadores) {
            investor.notificar(this);
        }

        System.out.println("");
    }

}
