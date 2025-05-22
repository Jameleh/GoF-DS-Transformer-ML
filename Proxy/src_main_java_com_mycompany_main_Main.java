package com.mycompany.main;

import com.mycompany.main.classes.CotacaoProxy;
import com.mycompany.main.interfaces.CotacaoService;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CotacaoService cotacao = new CotacaoProxy();
        
        System.out.println("Cotação " + cotacao.getCotacaoDolar());
        Thread.sleep(2000);
        System.out.println("Cotação " + cotacao.getCotacaoDolar());
    }
}
