import dinosaur.DinosaurFactory;
import dinosaur.iDinosaur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PterosaurTest {
    @Test
    void mustEat(){
        iDinosaur pterosaur = DinosaurFactory.getDinosaur("Pterosaur");
        assertEquals("O pterossauro está se alimentando", pterosaur.eat());
    }

    @Test
    void mustReproduce(){
        iDinosaur pterosaur = DinosaurFactory.getDinosaur("Pterosaur");
        assertEquals("O pterossauro deseja se reproduzir", pterosaur.reproduce());
    }
}
