package abstractFactory;

public class Profissional {
    private Cargo cargo;
    private Salario salario;

    public Profissional (FabricaAbstrata fabrica){
            this.cargo = fabrica.createCargo();
            this.salario = fabrica.createSalario();
    }

    public String checarCargo(){
        return this.cargo.checar();
    }

    public String checharSalario(){
        return this.salario.checar();
    }
}
