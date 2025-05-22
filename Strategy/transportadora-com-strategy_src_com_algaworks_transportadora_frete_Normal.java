package com.algaworks.transportadora.frete;

import com.algaworks.transportadora.service.Frete;
import com.algaworks.transportadora.service.TipoFrete;

public class Normal implements Frete {
    @Override
    public double calcularPreco(int distancia) {
       return distancia * 1.25 + 10;
    }

}
