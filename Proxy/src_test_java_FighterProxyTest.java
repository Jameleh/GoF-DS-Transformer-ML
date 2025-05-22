import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FighterProxyTest {
    @BeforeEach
    void setUp(){
        BD.addFighter(new Fighter(1, "Anderson Silva", "Spider", "Curitiba - PR",
                "34-11(1)","10% de todo evento PPV vendido que for luta principal"));

        BD.addFighter(new Fighter(2, "José Aldo", "Rei do Rio", "Rio de Janeiro - RJ",
                "31-7","5% de todo evento PPV vendido que for luta principal"));
    }
    @Test
    void deveRetornaNomeEApelidoECartel(){
        FighterProxy fighter = new FighterProxy(2);
        assertEquals(Arrays.asList("José Aldo", "Rei do Rio", "31-7"), fighter.accessFighterData());
    }

    @Test
    void deveRetornaClausulasContratuais(){
        Employee personal = new Employee("Dana White", true);
        FighterProxy fighter = new FighterProxy(1);
        assertEquals(Arrays.asList("10% de todo evento PPV vendido que for luta principal"), fighter.accessContractClauses(personal));
    }
    @Test
    void deveRetornaAcessoNaoAutorizado() {
        try {
            Employee personal = new Employee("Herb Dean", false);
            FighterProxy fighter = new FighterProxy(2);
            fighter.accessContractClauses(personal);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Acesso não autorizado.", e.getMessage());
        }
    }
}