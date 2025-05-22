import designpattern.comportamentais.Quarto;
import designpattern.comportamentais.QuartoEstadoCheckout;
import designpattern.comportamentais.QuartoEstadoReservado;
import designpattern.comportamentais.QuartoEstadoVazio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class QuartoTest {
    @Test
    void deveAmarzenarEstados()
    {
        Quarto quarto = new Quarto();
        quarto.setQuartoState(QuartoEstadoVazio.getInstance());
        quarto.setQuartoState(QuartoEstadoCheckout.getInstance());
        assertEquals(2, quarto.getStatesRoom().size());

    }

    @Test
    void deveAmarzenarEstadoInicial()
    {
        Quarto quarto = new Quarto();
        quarto.setQuartoState(QuartoEstadoVazio.getInstance());
        quarto.setQuartoState(QuartoEstadoCheckout.getInstance());
        quarto.toRestoreState(0);
        assertEquals(QuartoEstadoVazio.getInstance(), quarto.getStateRoom());

    }

    @Test
    void deveAmarzenarAnterior()
    {
        Quarto quarto = new Quarto();
        quarto.setQuartoState(QuartoEstadoVazio.getInstance());
        quarto.setQuartoState(QuartoEstadoReservado.getInstance());
        quarto.setQuartoState(QuartoEstadoVazio.getInstance());
        quarto.setQuartoState(QuartoEstadoCheckout.getInstance());
        quarto.toRestoreState(2);
        assertEquals(QuartoEstadoVazio.getInstance(), quarto.getStateRoom());
    }

    @Test
    void deveRetornarExecaoIndiceInvalido() {
        try {
            Quarto quarto = new Quarto();
            quarto.toRestoreState(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Indice inválido", e.getMessage());
        }
    }
}
