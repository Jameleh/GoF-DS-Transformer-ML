package iteratorTest;

import iterator.Controle;
import iterator.Estadio;
import iterator.Torcedor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleTest {

    @Test
    void deveRetornarNumeroTorcedoresComTicket() {
        Estadio estadio = new Estadio(
                new Torcedor("Krebim", true),
                new Torcedor("Kreisso", true),
                new Torcedor("krovis", false),
                new Torcedor("Kreito", true)
        );
        assertEquals(3, Controle.TorcedoresComTicket(estadio));
    }

    @Test
    void deveRetornarNumeroTorcedoresTotal() {
        Estadio estadio = new Estadio(
                new Torcedor("Krebim", true),
                new Torcedor("Kreisso", true),
                new Torcedor("krovis", false),
                new Torcedor("Kreito", true)
        );
        assertEquals(4, Controle.TotalTorcedores(estadio));
    }
}
