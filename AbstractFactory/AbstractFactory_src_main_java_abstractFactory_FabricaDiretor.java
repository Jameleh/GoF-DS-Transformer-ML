package abstractFactory;

public class FabricaDiretor implements FabricaAbstrata{

    @Override
    public Cargo createCargo() {
        return new CargoDiretor();
    }

    @Override
    public Salario createSalario() {
        return new SalarioDiretor();
    }
}
