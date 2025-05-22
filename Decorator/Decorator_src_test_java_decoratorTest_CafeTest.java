package decoratorTest;

import decorator.Cafe;
import decorator.CafeComLeite;
import decorator.Capuccino;
import decorator.TipoCafe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CafeTest {
    @Test
    void deveRetornarTipoCafe(){
        Cafe cafe = new TipoCafe();
        assertEquals("tipo ", cafe.informarTipo());
    }

    @Test
    void deveRetornarCafeComLeite(){
        Cafe cafe = new CafeComLeite(new TipoCafe());
        assertEquals("tipo  Cafe Com Leite", cafe.informarTipo());
    }

    @Test
    void deveRetornarCapuccino(){
        Cafe cafe = new Capuccino(new TipoCafe());
        assertEquals("tipo  Capuccino", cafe.informarTipo());
    }
}
