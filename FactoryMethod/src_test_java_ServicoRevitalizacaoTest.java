import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoRevitalizacaoTest {

    @Test
    public void deveAprovarRevitalizacao() {
        IServico servico = ServicoFactory.obterServico("Revitalizacao");
        assertEquals("Revitalizacao contratada", servico.contratado());
    }

    @Test
    public void deveReprovarRevitalizacao() {
        IServico servico = ServicoFactory.obterServico("Revitalizacao");
        assertEquals("Revitalizacao Recusada", servico.recusado());
    }
}