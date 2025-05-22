package proxy;

import java.util.List;

public class JogadorProxy implements IJogador {

    private Jogador jogador;

    private Integer id;

    public JogadorProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.jogador == null) {
            this.jogador = new Jogador(this.id);
        }
        return this.jogador.obterDadosPessoais();
    }

    @Override
    public List<String> obterItens(Administrador administrador) {
        if (!administrador.isMaster()) {
            throw new IllegalArgumentException("Administrador não autorizado");
        }
        if (this.jogador == null) {
            this.jogador = new Jogador(this.id);
        }
        return this.jogador.obterItens(administrador);
    }
}
