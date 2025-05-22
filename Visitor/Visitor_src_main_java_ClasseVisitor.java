public class ClasseVisitor implements Visitor{

    public String exibir(Classe classe) {
        return classe.aceitar(this);
    }

    @Override
    public String exibirArqueiro(Arqueiro arqueiro) {
        return "Aluno{" +
                "nível=" + arqueiro.getNivel() +
                ", nome='" + arqueiro.getNome() + '\'' +
                ", número de flechas=" + arqueiro.getNumFlechas() +
                '}';
    }

    @Override
    public String exibirGuerreiro(Guerreiro guerreiro) {
        return "Professor{" +
                "nível=" + guerreiro.getNivel() +
                ", nome='" + guerreiro.getNome() + '\'' +
                ", arma='" + guerreiro.getArma() + '\'' +
                '}';
    }

    @Override
    public String exibirMago(Mago mago) {
        return "Funcionario{" +
                "nível=" + mago.getNivel() +
                ", nome='" + mago.getNome() + '\'' +
                ", magia='" + mago.getMagia() + '\'' +
                '}';
    }
}
