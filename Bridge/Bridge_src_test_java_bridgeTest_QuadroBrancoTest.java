package bridgeTest;

import brigde.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadroBrancoTest {
    @Test
    void deveRetornarQuadroBrancoAzul(){
        Caneta caneta = new QuadroBranco(new Azul());
        assertEquals("Caneta de quadro branco de cor azul",caneta.getCaneta());
    }

    @Test
    void deveRetornarQuadroBrancoVermelha(){
        Caneta caneta = new QuadroBranco(new Vermelha());
        assertEquals("Caneta de quadro branco de cor vermelha",caneta.getCaneta());
    }
}
