import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginEFTest {

    @Test
    public void deveLogarEntidadeFilantropica() {
        IService servico = ServiceFactory.getService("LoginEF");
        assertEquals("Token de acesso a usuário Entidade Filantrópica validado no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarEntidadeFilantropica() {
        IService servico = ServiceFactory.getService("LoginEF");
        assertEquals("Token de acesso a usuário Entidade Filantrópica revogado no sistema com sucesso", servico.logout());
    }
}