
package com.mycompany.adapter;

public class PagamentoAdapter implements Pagamento{
    
    private SistemaAntigo sistemaAntigo;
    
    public PagamentoAdapter(){
        this.sistemaAntigo = new SistemaAntigo();
    }
    
    public void pagar(double valor){
        sistemaAntigo.realizarPagamento(valor);
    }
    
    
    
}
