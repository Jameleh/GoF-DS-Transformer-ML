package observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void adicionarOferta(Oferta oferta) {
        oferta.addObserver(this);
    }

    @Override
    public void update(Observable oferta, Object arg) {
        this.ultimaNotificacao = this.nome + ", preco atualizado em " + oferta.toString();
    }
}