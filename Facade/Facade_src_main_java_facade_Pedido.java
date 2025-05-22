package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

    private List<Produto> produtosEmFalta = new ArrayList<Produto>();

    public void addProdutoEmFalta(Produto produto) {
        this.produtosEmFalta.add(produto);
    }

    public boolean verificarProdutoEmFalta(Produto produto) {
        return this.produtosEmFalta.contains(produto);
    }

}
