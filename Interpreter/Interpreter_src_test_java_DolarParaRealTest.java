import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class DolarParaRealTest {

    @Test
    void deveRetornarValorConvertido() {
        DolarParaReal dolarReal = new DolarParaReal();
        dolarReal.setValor(5.0);
        dolarReal.setTaxa(0.1);

        assertEquals(25.5  , Math.round(dolarReal.calcularNota()*100.0)/100.0);
    }


}