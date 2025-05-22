package com.mycompany.main.classes;

import com.mycompany.main.interfaces.CotacaoService;
import java.time.LocalDateTime;

public class CotacaoProxy implements CotacaoService{

    private double cache;
    private LocalDateTime ultimaConsulta;
    private final CotacaoAPI cotacaoReal;

    public CotacaoProxy() {
        this.cotacaoReal = new CotacaoAPI();
    }
    
    @Override
    public double getCotacaoDolar() {
        if(ultimaConsulta == null || ultimaConsulta.plusMinutes(5).isBefore(LocalDateTime.now())){
            System.out.println("Cache expirado. Consultando a API real...");
            cache = cotacaoReal.getCotacaoDolar();
            ultimaConsulta = LocalDateTime.now();
        } else {
            System.out.println("Retornando o valor do cache");
        }    
            return cache;
    }
    
}
