package com.algaworks.model.builder;

import com.algaworks.model.Cliente;
import com.algaworks.model.ItemPedido;
import com.algaworks.model.PedidoVenda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

    private PedidoVenda instancia;

    public PedidoVendaBuilder() {
        this.instancia = new PedidoVenda();
    }

    public PedidoVendaBuilder comClienteVip(String nome){
        definirCliente(nome, true);
        return this;
    }

    public PedidoVendaBuilder comClienteNormal(String nome){
        definirCliente(nome, false);
        return this;
    }

    public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valorUnitario){
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setNome(nome);
        itemPedido.setQuantidade(quantidade);
        itemPedido.setValorUnitario(new BigDecimal(valorUnitario));

        if (this.instancia.getItensPedido() == null){
            this.instancia.setItensPedido(new ArrayList<ItemPedido>());
        }

        this.instancia.getItensPedido().add(itemPedido);
        return this;
    }

    public PedidoVendaBuiderValido comNumero(String numero){
        this.instancia.setNumero(numero);
        return new PedidoVendaBuiderValido(instancia);
    }

    public void definirCliente(String nome, boolean vip){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setVip(vip);
        this.instancia.setCliente(cliente);
    }




}
