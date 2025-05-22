import java.util.ArrayList;
import java.util.List;

public class LojaChevrolet {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastro(String nomeCliente, String sobrenomeCliente, int cpfCliente, String modeloCarro, int anoCarro, String corCarro){
        Carro carro = CarroFactory.getCarro(modeloCarro, anoCarro, corCarro);
        Cliente cliente = new Cliente(nomeCliente, sobrenomeCliente, cpfCliente, carro);
        clientes.add(cliente);
    }
    public List<String> obterClientes(){
        List<String> saida = new ArrayList<String>();
        for(Cliente cliente : this.clientes){
            saida.add(cliente.obterCliente());
        }
        return saida;
    }
}
