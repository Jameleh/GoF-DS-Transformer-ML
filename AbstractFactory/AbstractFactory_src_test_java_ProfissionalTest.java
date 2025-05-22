import abstractFactory.FabricaAbstrata;
import abstractFactory.FabricaDiretor;
import abstractFactory.FabricaEstagiario;
import abstractFactory.Profissional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProfissionalTest {
    @Test
    void deveChecarCargoDiretor() {
        FabricaAbstrata fabrica = new FabricaDiretor();
        Profissional profissional = new Profissional(fabrica);
        assertEquals("Cargo: Diretor", profissional.checarCargo());
    }

    @Test
    void deveChecarSalarioDiretor() {
        FabricaAbstrata fabrica = new FabricaDiretor();
        Profissional profissional = new Profissional(fabrica);
        assertEquals("Salario: R$50000,00", profissional.checharSalario());
    }

    @Test
    void deveChecarCargoEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Profissional profissional = new Profissional(fabrica);
        assertEquals("Cargo: Estagiario", profissional.checarCargo());
    }

    @Test
    void deveChecarSalarioEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Profissional profissional = new Profissional(fabrica);
        assertEquals("Salario: R$900,00", profissional.checharSalario());
    }
}
