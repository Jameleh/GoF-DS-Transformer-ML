package proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Jogador> jogadores = new HashMap<>();

    public static Jogador getJogador(Integer id) {
        return jogadores.get(id);
    }

    public static void addJogador(Jogador jogador) {
        jogadores.put(jogador.getId(), jogador);
    }
}
