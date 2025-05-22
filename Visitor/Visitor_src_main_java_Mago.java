public class Mago implements Classe{

    private int nivel;
    private String nome;
    private String magia;

    public Mago(int nivel, String nome, String magia) {
        this.nivel = nivel;
        this.nome = nome;
        this.magia = magia;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getMagia() {
        return magia;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMago(this);
    }
}
