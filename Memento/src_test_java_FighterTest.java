import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {
    
    @Test
    void deveArmazenarEstados() {
        Fighter fighter = new Fighter();
        fighter.setState(FighterStateSignedFightContract.getInstance());
        fighter.setState(FighterStateTraining.getInstance());
        fighter.setState(FighterStateWeightCut.getInstance());
        fighter.setState(FighterStateReadyToFight.getInstance());
        assertEquals(4, fighter.getStates().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Fighter fighter = new Fighter();
        fighter.setState(FighterStateSignedFightContract.getInstance());
        fighter.setState(FighterStateTraining.getInstance());
        fighter.restoreState(0);
        assertEquals(FighterStateSignedFightContract.getInstance(), fighter.getState());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Fighter fighter = new Fighter();
        fighter.setState(FighterStateSignedFightContract.getInstance());
        fighter.setState(FighterStateTraining.getInstance());
        fighter.setState(FighterStateWeightCut.getInstance());
        fighter.setState(FighterStateReadyToFight.getInstance());
        fighter.restoreState(2);
        assertEquals(FighterStateWeightCut.getInstance(), fighter.getState());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Fighter fighter = new Fighter();
            fighter.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}

