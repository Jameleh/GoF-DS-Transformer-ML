
import dinosaur.iDinosaur;
import dinosaur.DinosaurFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DinosaurFactoryJava {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            iDinosaur servico = DinosaurFactory.getDinosaur("Inválido");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Este ser vivo não é um dinossauro", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            iDinosaur servico = DinosaurFactory.getDinosaur("Pterossauro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Dinossauro Inválido. O ser em questão não é classificado como um dinossauro" +
                    "", e.getMessage());
        }
    }
}
