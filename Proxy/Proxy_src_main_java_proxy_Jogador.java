package proxy;

import java.util.Arrays;
import java.util.List;

public class Jogador implements IJogador {

    private Integer id;
    private String nome;
    private String cidade;
    private String item1;
    private String item2;

    public Jogador(int id) {
        this.id = id;
        Jogador objeto = BD.getJogador(id);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.item1 = objeto.item1;
        this.item2 = objeto.item2;
    }

    public Jogador(Integer id, String nome, String cidade, String item1, String item2) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.item1 = item1;
        this.item2 = item2;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<String> obterItens(Administrador administrador) {
        return Arrays.asList(this.item1, this.item2);
    }
}
