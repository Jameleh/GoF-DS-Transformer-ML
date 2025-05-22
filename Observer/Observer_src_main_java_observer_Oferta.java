package observer;

import java.util.Observable;

public class Oferta extends Observable {
    private String nomeProduto;
    private Double preco;
    private String loja;

    public Oferta(String nomeProduto, Double preco, String loja) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.loja = loja;
    }

    public void atualizarOferta(double novoPreco) {
        double precoAntigo = preco;
        preco = novoPreco;
        if(novoPreco < precoAntigo) {
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "nomeProduto=" + nomeProduto +
                ", preco=" + preco +
                ", loja=" + loja +
                '}';
    }
}