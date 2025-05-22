package MainProxy;
import java.math.BigDecimal;

import MainProxy.modelo.Orcamento;
import MainProxy.modelo.OrcamentoProxy;

public class Main {
public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), new BigDecimal("10"));
    System.out.println("Valor do orcamento = " + orcamento.getValorOrcamento());
    System.out.println("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());

    OrcamentoProxy proxy = new OrcamentoProxy(orcamento);

    System.out.println("valor sem proxy = " + orcamento.getDescontoOrcamento());
    System.out.println("valor com proxy = " + orcamento.getDescontoOrcamento());
    System.out.println("valor com proxy = " + orcamento.getDescontoOrcamento());
    System.out.println("valor com proxy = " + orcamento.getDescontoOrcamento());
    
}
}  