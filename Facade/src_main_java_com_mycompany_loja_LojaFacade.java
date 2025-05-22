package com.mycompany.loja;

public class LojaFacade {
    
    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;
    
    public void comprarFilme(){
        Estoque estoque = new Estoque();
        Pagamento pagamento = new Pagamento();
        Envio envio = new Envio();
        
        if(estoque.verificarDisponibilidade()){
            pagamento.processarPagamento();
            envio.enviar();
        }
        
    }
    
}
