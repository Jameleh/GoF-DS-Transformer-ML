package composite;

public class Programador extends Funcionario {
    private String nome;

    public Programador(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getFuncionario() {
        return "Programador: " + this.getNome() + " - Senioridade: " + this.getDescricao() + "\n";
    }
}
