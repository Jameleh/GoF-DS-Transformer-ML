package br.com.exemplos.observer;

import br.com.exemplos.dominio.Investimento;

public interface IObservador {

    public String getNome();

    public void notificar(Investimento investimento);

}
