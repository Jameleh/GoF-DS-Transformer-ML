package facade;

public class ProdutoFacade {

    public static boolean verificarDisponibilidadeProduto(Produto produto) {
        if (EstoqueFisico.getInstancia().verificarProdutoEmFalta(produto)) {
            return false;
        }
        if (EstoqueSite.getInstancia().verificarProdutoEmFalta(produto)) {
            return false;
        }

        return true;
    }
}
