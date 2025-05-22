package proxy;

public class Administrador {
    private String nome;
    private boolean master;

    public Administrador(String nome, boolean master) {
        this.nome = nome;
        this.master = master;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }
}
