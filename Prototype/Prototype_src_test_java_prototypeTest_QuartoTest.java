package prototypeTest;
import org.junit.jupiter.api.Test;
import prototype.Hospede;
import prototype.Quarto;

import static org.junit.jupiter.api.Assertions.*;

public class QuartoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Quarto quarto = new Quarto(504, 5, 500, 0,new Hospede("Jorge da Silva", "10987654321"));

        Quarto quartoClone = quarto.clone();
        quartoClone.setNumeroQuarto(205);
        quartoClone.setAndar(2);
        quartoClone.getHospede().setNome("Claudio da Silva");
        quartoClone.getHospede().setCpf("12345678910");

        assertEquals("Quarto{numeroQuarto=504, andar=5, precoDiaria=500.0, outrosGastos=0.0, hospede=Hospede{nome='Jorge da Silva', cpf='10987654321'}}", quarto.toString());
        assertEquals("Quarto{numeroQuarto=205, andar=2, precoDiaria=500.0, outrosGastos=0.0, hospede=Hospede{nome='Claudio da Silva', cpf='12345678910'}}", quartoClone.toString());
    }
}
