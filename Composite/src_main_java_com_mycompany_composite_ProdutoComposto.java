package com.mycompany.composite;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposto implements Produto{
    
    private String nome;
    private List<Produto> itens = new ArrayList<>(); 
    
    public ProdutoComposto(String nome){
        this.nome = nome;
    }
    
    public void adicionar(Produto produto){
        itens.add(produto);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for(Produto produto : itens){
            total += produto.getPreco();
        }
        return total;
    }
}
