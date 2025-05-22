import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoHigienizacaoTest {

    @Test
    public void deveAprovarHigienizacao() {
        IServico servico = ServicoFactory.obterServico("HigienizacaoInterior");
        assertEquals("Higienizacao contratada", servico.contratado());
    }

    @Test
    public void deveReprovarHigienizacao() {
        IServico servico = ServicoFactory.obterServico("HigienizacaoInterior");
        assertEquals("Higienizacao Recusada, pois o limite do prazo foi excedido", servico.recusado());
    }
}