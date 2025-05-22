import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoTest {
    @Test
    void deveSolicitarPermissaoAoAeroporto(){
        Jatinho jatinho = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, recebeu o seu comunicado, seu aviao tem permissão",
                jatinho.recebePermissaoDePousar("Estamos a 5km do Aeroporto, solicitou permissão de pousar."));
    }
    @Test
    void deveAvisarSobreColisaoAoAeroporto(){
        Jatinho jatinho = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, estara enviando apoio, mais rápido possível",
                jatinho.recebeAvisoDeColisao("Tivemos uma colisão com uma antena, solicito resposta mais rápido possível."));
    }

    @Test
    void deveAvisarFalhaMecanicaAoAeroporto(){
        Jatinho jatinho = new Jatinho();
        assertEquals("Recebemos o seu contato.\nO Aeroporto responde conforme a solicitação\n"+
                        ">>O Aeroporto, enviou sugestoes de manutenção",
                jatinho.recebeAvisoDeFalhaMecanica("Jatinho sem Fim, teve uma falha mecânica, necessito de apoio."));
    }

}