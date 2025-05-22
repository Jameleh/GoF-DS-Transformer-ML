package proxyTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.Administrador;
import proxy.BD;
import proxy.Jogador;
import proxy.JogadorProxy;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JogadorTest {

    @BeforeEach
    void setUp() {
        BD.addJogador(new Jogador(1, "Creitim", "Juiz de Fora", "Espada", "Escudo"));
        BD.addJogador(new Jogador(2, "Joesley", "Juiz de Fora", "Arco e flecha", "Espada"));
    }

    @Test
    void deveRetornarDadosPessoaisJogador() {
        JogadorProxy jogador = new JogadorProxy(1);

        assertEquals(Arrays.asList("Creitim", "Juiz de Fora"), jogador.obterDadosPessoais());
    }

    @Test
    void deveRetonarItensJogador() {
        Administrador administrador = new Administrador("Anaconda", true);
        JogadorProxy jogador = new JogadorProxy(2);

        assertEquals(Arrays.asList("Arco e flecha", "Espada"), jogador.obterItens(administrador));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarItensJogador() {
        try {
            Administrador administrador = new Administrador("Joanadarc", false);
            JogadorProxy jogador = new JogadorProxy(2);

            jogador.obterItens(administrador);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Administrador não autorizado", e.getMessage());
        }
    }
}
