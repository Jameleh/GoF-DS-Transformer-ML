package proxy;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
    
        InterfaceProxy proxy = new Secretario(new Ceo("22/10/2020 as 22:00", "Ygor", null));
        
        System.out.println("Programação Avançada - Padrão Proxy\n");
        System.out.println(proxy.reuniao());
        System.out.println("");
        System.out.println(proxy.informacoesSimples());
        System.out.println("");
        System.out.println(proxy.informacoesSigilosas());
    }
    
}
