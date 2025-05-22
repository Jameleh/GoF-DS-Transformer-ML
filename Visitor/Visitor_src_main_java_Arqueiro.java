public class Arqueiro implements Classe{

    private int nivel;
    private String nome;
    private int numFlechas;

    public Arqueiro(int nivel, String nome, int numFlechas) {
        this.nivel = nivel;
        this.nome = nome;
        this.numFlechas = numFlechas;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirArqueiro(this);
    }
}
