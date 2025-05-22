package br.com.exemplos;

import br.com.exemplos.dominio.PapelBovespa;
import br.com.exemplos.observer.Observador;

public class Main {

    public static void main(String[] args) {
        var joao = new Observador("Jo„o");
        var eduardo = new Observador("Eduardo");
        var bill = new Observador("Bill");

        var amazon = new PapelBovespa("Amazon", nextDecimal());
        var microsoft = new PapelBovespa("Microsoft", nextDecimal());

        amazon.subscribe(joao);
        amazon.subscribe(eduardo);

        microsoft.subscribe(eduardo);
        microsoft.subscribe(bill);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            amazon.setValor(nextDecimal());
            microsoft.setValor(nextDecimal());

            if (i == 1) {
                amazon.UnSubscribe(eduardo);
            }
        }
    }

    public static double nextDecimal() {
        return Double.valueOf(Math.random() * 10 / 2.1 * 5.3);
    }

}
