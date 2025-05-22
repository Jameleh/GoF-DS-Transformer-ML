package adapter;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
      Boleto boleto = new Boleto();
      CartaoDebito pagamentoAdapter = new PagamentoAdapter(boleto);
      
      System.out.println("Programação Avançada - Padrão Adapter\n");
      
      System.out.println("Boleto: ");
      boleto.metodoPagamento();
      
      System.out.println("");
      
      System.out.println("Cartão de Debito: ");
      pagamentoAdapter.metodoPagamento();
      
      
    }
    
}
