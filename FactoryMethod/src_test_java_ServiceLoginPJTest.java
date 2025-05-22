import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginPJTest {

    @Test
    public void deveLogarPessoaJuridica() {
        IService servico = ServiceFactory.getService("LoginPJ");
        assertEquals("Token de acesso a usuário Pessoa jurídica validado no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarPessoaJuridica() {
        IService servico = ServiceFactory.getService("LoginPJ");
        assertEquals("Token de acesso a usuário Pessoa jurídica revogado no sistema com sucesso", servico.logout());
    }
}