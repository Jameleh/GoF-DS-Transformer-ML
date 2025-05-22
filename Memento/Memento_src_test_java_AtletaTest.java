import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtletaTest {

    @Test
    void deveArmazenarAcaos() {
        Atleta atleta = new Atleta();
        atleta.setAcao(AtletaAcaoDescansando.getInstance());
        atleta.setAcao(AtletaAcaoComendo.getInstance());
        assertEquals(2, atleta.getAcaos().size());
    }

    @Test
    void deveRetornarAcaoInicial() {
        Atleta atleta = new Atleta();
        atleta.setAcao(AtletaAcaoDescansando.getInstance());
        atleta.setAcao(AtletaAcaoComendo.getInstance());
        atleta.restauraAcao(0);
        assertEquals(AtletaAcaoDescansando.getInstance(), atleta.getAcao());
    }

    @Test
    void deveRetornarAcaoAnterior() {
        Atleta atleta = new Atleta();
        atleta.setAcao(AtletaAcaoDescansando.getInstance());
        atleta.setAcao(AtletaAcaoComendo.getInstance());
        atleta.setAcao(AtletaAcaoDescansando.getInstance());
        atleta.setAcao(AtletaAcaoTreinandoMusculacao.getInstance());
        atleta.restauraAcao(2);
        assertEquals(AtletaAcaoDescansando.getInstance(), atleta.getAcao());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Atleta aluno = new Atleta();
            aluno.restauraAcao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
