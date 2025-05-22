package proxy;
/**
 *
 * @author Ygor
 */
public class Secretario implements InterfaceProxy{

    private InterfaceProxy interfaceProxy;
    
    public Secretario(InterfaceProxy interfaceProxy) {
	this.interfaceProxy = interfaceProxy;
    }
    
    @Override
    public String reuniao() {
        System.out.println("Informação filtrada");
        return interfaceProxy.reuniao();
    }

    @Override
    public String informacoesSimples() {
        System.out.println("Informação filtrada");
        return interfaceProxy.informacoesSimples();
    }

    @Override
    public String informacoesSigilosas() {
        return "Acesso restrito ao CEO da empresa.";
    }
    
}
