import dinosaur.DinosaurFactory;
import dinosaur.iDinosaur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriceratopsTest {
    @Test
    void mustEat(){
        iDinosaur triceratops = DinosaurFactory.getDinosaur("Triceratops");
        assertEquals("Este dinossauro está se alimentando", triceratops.eat());
    }

    @Test
    void mustReproduce(){
        iDinosaur triceratops = DinosaurFactory.getDinosaur("Triceratops");
        assertEquals("Este dinossauro deseja se reproduzir", triceratops.reproduce());
    }
}
