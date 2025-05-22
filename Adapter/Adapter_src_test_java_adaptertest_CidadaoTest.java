package adaptertest;
import adapter.Cidadao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CidadaoTest {

    @Test
    void deveRetornarCpfSemMascara(){
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("14113632642");

        assertEquals("14113632642", cidadao.getCpf());
    }

    @Test
    void deveRetornarCpfComMascara(){
        Cidadao cidadao = new Cidadao();
        cidadao.setCpf("14113632642");

        assertEquals("141.136.326-42", cidadao.getCpfComMascara());
    }
}
