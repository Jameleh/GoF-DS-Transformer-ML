import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    Jogador jogador;
    Jogo jogo;

    @BeforeEach
    void setUp(){
        jogador = new Jogador("Creitin");
        jogo = new Jogo();
    }

    @Test
    void deveAtacar() {
        Tarefa ataque = new AtaqueJogador(jogador);
        jogo.executarTarefa(ataque);

        assertEquals("O jogador está Atacando", jogador.getAcao());
    }

    @Test
    void deveDefender() {
        Tarefa defesa = new DefesaJogador(jogador);
        jogo.executarTarefa(defesa);

        assertEquals("O jogador está Defendendo", jogador.getAcao());
    }


    @Test
    void deveCancelarAtaque() {
        Tarefa defesa = new DefesaJogador(jogador);
        Tarefa ataque = new AtaqueJogador(jogador);

        jogo.executarTarefa(defesa);
        jogo.executarTarefa(ataque);

        jogo.cancelarUltimaTarefa();

        assertEquals("O jogador está Defendendo", jogador.getAcao());
    }

    @Test
    void deveCancelarDefesa() {
        Tarefa defesa = new DefesaJogador(jogador);
        Tarefa ataque = new AtaqueJogador(jogador);

        jogo.executarTarefa(ataque);
        jogo.executarTarefa(defesa);

        jogo.cancelarUltimaTarefa();

        assertEquals("O jogador está Atacando", jogador.getAcao());
    }
}
