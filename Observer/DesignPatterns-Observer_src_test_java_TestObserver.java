import frase.impl.Observador;
import frase.impl.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestObserver
{
    @Test
    public void testeInscritos(){
        Observavel frase = new Observavel();
        Observador obs1 = new Observador(1);
        frase.registraObservador(obs1);
        assertTrue(!frase.getClientes().isEmpty());
    }

    @Test
    public void teste2Inscritos(){
        Observavel frase = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        frase.registraObservador(obs1);
        frase.registraObservador(obs2);
        frase.registraObservador(obs3);
        frase.removeObservador(obs1);
        assertEquals(frase.getClientes().size(), 2);
    }

    @Test
    public void testeNumeroPalavras(){
        Observavel frase = new Observavel();
        Observador obs1 = new Observador(1);
        frase.setNovaFrase("Frase de teste");
        frase.registraObservador(obs1);
        int resultado = frase.getNumPalavras();
        assertEquals(3, resultado);
    }
}
