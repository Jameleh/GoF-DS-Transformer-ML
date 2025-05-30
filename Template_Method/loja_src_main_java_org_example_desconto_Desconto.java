package org.example.desconto;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract  class Desconto {

    protected   Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }


    public  BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            efetuarCalculo(orcamento);
        }return proximo.calcular(orcamento);
    };
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);
}
