import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoLimpezaTest {

    @Test
    public void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Limpeza");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}