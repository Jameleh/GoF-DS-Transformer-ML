public class Jogador {

    private String nome;
    private String acao;

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getAcao(){
        return this.acao;
    }

    public void atacar(){
        this.acao = "O jogador está Atacando";
    }

    public void defender(){
        this.acao = "O jogador está Defendendo";
    }
}
