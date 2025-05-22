package iterator;

public class Torcedor {

    private String nome;
    private boolean hasTicket;

    public Torcedor(String nome, boolean hasTicket) {
        this.nome = nome;
        this.hasTicket = hasTicket;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getTicket() {
        return hasTicket;
    }

    public void setTicket(boolean hasTicket) {
        this.hasTicket = hasTicket;
    }
}
