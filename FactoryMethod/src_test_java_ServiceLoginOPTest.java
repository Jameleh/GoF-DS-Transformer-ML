import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginOPTest {
    @Test
    public void deveRetornarExcessaoServicoInexistente() {
        try{
            IService servico = ServiceFactory.getService("Login");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcessaoServicoInvalido() {
        try {
            IService servico = ServiceFactory.getService("LoginOP");
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }

    }
}