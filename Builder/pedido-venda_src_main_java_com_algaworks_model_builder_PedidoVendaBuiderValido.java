package com.algaworks.model.builder;

import com.algaworks.model.PedidoVenda;

public class PedidoVendaBuiderValido {
    private PedidoVenda instancia;

    public PedidoVendaBuiderValido(PedidoVenda instancia) {
        this.instancia = instancia;
    }

    public PedidoVenda contruir(){
        return this.instancia;
    }
}
