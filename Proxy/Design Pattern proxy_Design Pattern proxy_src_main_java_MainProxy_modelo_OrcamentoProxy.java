package MainProxy.modelo;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal descontoOrcamento;
    
    private final Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
            this.orcamento = orcamento;
    }

    @Override
        public BigDecimal getDescontoOrcamento() {
     if(descontoOrcamento == null){
        this.descontoOrcamento = orcamento.getDescontoOrcamento();
     }
        return descontoOrcamento;
    }

    @Override
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;

    }
}