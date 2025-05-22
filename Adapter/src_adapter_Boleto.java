package adapter;
/**
 *
 * @author Ygor
 */
public class Boleto implements Pagamento{

    @Override
    public void metodoPagamento() {
        System.out.println("Pagamento efetuado com sucesso!");
    }
    
}
