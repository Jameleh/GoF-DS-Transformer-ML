package abstractFactory;

public class FabricaEstagiario implements FabricaAbstrata{

    @Override
    public Cargo createCargo() {
        return new CargoEstagiario();
    }

    @Override
    public Salario createSalario() {
        return new SalarioEstagiario();
    }
}
