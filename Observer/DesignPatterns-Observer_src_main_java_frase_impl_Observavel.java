package frase.impl;

import frase.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Observavel implements iObservavel
{
    private String frase;
    private int numPalavras, palavrasPares, palavrasMaiusculas;
    private List<Observador> clientes;

    public Observavel()
    {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if (clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    //Esse método é chamado sempre que os valores
    //se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovaFrase(String frase) {
        System.out.println("\n\n####### Nova frase! #######\n\n");
        this.frase = frase;

        StringTokenizer stringTokenizer = new StringTokenizer(frase);
        this.numPalavras = stringTokenizer.countTokens();

        novasMedidas();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getNumPalavras() {
        return numPalavras;
    }

    public void setNumPalavras(int quant) {
        this.numPalavras = quant;
    }

    public int getPalavrasPares() {
        return palavrasPares;
    }

    public int getPalavrasMaiusculas() {
        return palavrasMaiusculas;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }
}
