package com.mycompany.composite;

public class Composite {

    public static void main(String[] args) {
        
        Produto produto1 = new ProdutoSimples("Mouse", 100.0);
        Produto produto2 = new ProdutoSimples("Teclado Mecanico", 1200.0);
        Produto produto3 = new ProdutoSimples("Monitor", 800.0);
        
        ProdutoComposto combo1 = new ProdutoComposto("Kit Escritório");
        combo1.adicionar(produto1);
        combo1.adicionar(produto2);
        
        ProdutoComposto combo2 = new ProdutoComposto("Estação de Trabalho");
        combo2.adicionar(combo1);
        combo2.adicionar(produto3);
        
        System.out.println(combo2.getNome() + " Preço total " + combo2.getPreco());
        System.out.println(combo1.getNome() + " Preço total " + combo1.getPreco());
        
        
        
        
    }
}
