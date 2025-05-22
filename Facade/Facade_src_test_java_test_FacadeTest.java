package test;

import facade.EstoqueFisico;
import facade.EstoqueSite;
import facade.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {

    @Test
    void deveRetornarProdutoEmFaltaEstoqueFisico() {
        Produto produto = new Produto();
        EstoqueFisico.getInstancia().addProdutoEmFalta(produto);

        assertEquals(false, produto.vender());
    }

    @Test
    void deveRetornarProdutoEmFaltaEstoqueSite() {
        Produto produto = new Produto();
        EstoqueSite.getInstancia().addProdutoEmFalta(produto);

        assertEquals(false, produto.vender());
    }

    @Test
    void deveRetornarProdutoConstaEmEstoque() {
        Produto produto = new Produto();

        assertEquals(true, produto.vender());
    }
}
