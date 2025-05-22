package composite;

import java.util.ArrayList;
import java.util.List;

public class Time extends Funcionario{
    private List<Funcionario> funcionarios;

    public Time(String descricao) {
        super(descricao);
        this.funcionarios =  new ArrayList<Funcionario>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public String getFuncionario() {
        String saida = "";
        saida = "Time: " + this.getDescricao() + "\n";
        for (Funcionario funcionario : funcionarios) {
            saida += funcionario.getFuncionario();
        }
        return saida;
    }

}
