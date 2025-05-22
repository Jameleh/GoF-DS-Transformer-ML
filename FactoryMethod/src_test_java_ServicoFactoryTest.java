import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoFactoryTest {

    @Test
    public void deveRetornarExceçãoParaServicoinexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Teste");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

}
