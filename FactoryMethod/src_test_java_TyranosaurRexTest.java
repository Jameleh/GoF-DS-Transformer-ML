import dinosaur.iDinosaur;
import dinosaur.DinosaurFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TyranosaurRexTest {
    @Test
    void mustEat(){
        iDinosaur tyranosaur = DinosaurFactory.getDinosaur("Tyranosaur");
        assertEquals("Este dinossauro está se alimentando", tyranosaur.eat());
    }

    @Test
    void mustReproduce(){
        iDinosaur tyranosaur = DinosaurFactory.getDinosaur("Tyranosaur");
        assertEquals("Este dinossauro deseja se reproduzir", tyranosaur.reproduce());
    }
}
