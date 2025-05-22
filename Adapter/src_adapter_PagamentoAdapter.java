package adapter;
/**
 *
 * @author Ygor
 */
public class PagamentoAdapter extends CartaoDebito{
    Pagamento cartaoDebito;
    public PagamentoAdapter(Pagamento cartaoDebito){
        this.cartaoDebito = cartaoDebito;
    }
    @Override
    public void metodoPagamento() {
        cartaoDebito.metodoPagamento();
    }
    
}
