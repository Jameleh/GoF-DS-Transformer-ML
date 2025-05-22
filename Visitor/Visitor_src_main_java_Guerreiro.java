public class Guerreiro implements Classe{

    private int nivel;
    private String nome;
    private String arma;

    public Guerreiro(int nivel, String nome, String arma) {
        this.nivel = nivel;
        this.nome = nome;
        this.arma = arma;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGuerreiro(this);
    }
}
