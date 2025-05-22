package proxy;
/**
 *
 * @author Ygor
 */
public class Ceo implements InterfaceProxy{
    
    private String diaHora;
    private String nome;
    private String senha;

    public Ceo(String diaHora, String nome, String senha) {
        this.diaHora = diaHora;
        this.nome = nome;
        this.senha = senha;
    }
    
    @Override
    public String reuniao(){
        return "Data é Hora da Reunião: "+diaHora;
    }
    
    @Override
    public String informacoesSimples(){
        return "Nome: "+nome;
    }
    
    @Override
    public String informacoesSigilosas(){
        return "Senha: "+senha;
    }
}
