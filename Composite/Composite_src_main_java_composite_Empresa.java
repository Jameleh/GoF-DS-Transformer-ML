package composite;

public class Empresa {
    private Funcionario funcionario;

    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    public String getFuncionario(){
        if(this.funcionario == null){
            throw new NullPointerException("Empresa sem funcionario");
        }
        return this.funcionario.getFuncionario();
    }
}
