import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginPFTest {

    @Test
    public void deveLogarPessoaFisica() {
        IService servico = ServiceFactory.getService("LoginPF");
        assertEquals("Token de acesso a usuário Pessoa física validado no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarPessoaFisica() {
        IService servico = ServiceFactory.getService("LoginPF");
        assertEquals("Token de acesso a usuário Pessoa física revogado no sistema com sucesso", servico.logout());
    }
}