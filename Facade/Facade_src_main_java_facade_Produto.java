package facade;

public class Produto {

    public boolean vender() {
        return ProdutoFacade.verificarDisponibilidadeProduto(this);
    }

}
