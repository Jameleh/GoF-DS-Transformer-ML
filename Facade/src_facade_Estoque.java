package facade;
/**
 *
 * @author Ygor
 */
public class Estoque {
    int quantidade = 100; // Quantidade de produtos em estoque.
    public void reduzEstoque(int estoque){
        estoque = quantidade - estoque;
        System.out.println("Quantidade atual de produtos em estoque após a venda: "+ estoque);
    }
}
