package bridgeTest;

import brigde.Azul;
import brigde.Caneta;
import brigde.Esferografica;
import brigde.Vermelha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EsferograficaTest {

    @Test
    void deveRetornarEsferograficaAzul(){
        Caneta caneta = new Esferografica(new Azul());
        assertEquals("Caneta esferografica de cor azul",caneta.getCaneta());
    }

    @Test
    void deveRetornarEsferograficaVermelha(){
        Caneta caneta = new Esferografica(new Vermelha());
        assertEquals("Caneta esferografica de cor vermelha",caneta.getCaneta());
    }
}
