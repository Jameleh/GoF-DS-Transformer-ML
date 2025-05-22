public class ControleDeTrafegoAereo {
    private static ControleDeTrafegoAereo instancia = new ControleDeTrafegoAereo();

    private ControleDeTrafegoAereo () {}

    public static ControleDeTrafegoAereo getInstancia(){
        return instancia;
    }

    public String recebePermissaoDoPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Aeroporto responde conforme a solicitação\n"+
                ">>" +  Aeroporto.getInstancia().recebePermissaoDePousar(mensagem);
    }
    public String recebeAvisoDeColisaoParaPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Aeroporto responde conforme a solicitação\n"+
                ">>" +  Aeroporto.getInstancia().recebeAvisoDeColisao(mensagem);
    }
    public String recebeAvisoDeFalhaMecanicaNoPorto(String mensagem){
        return  "Recebemos o seu contato.\n"+
                "O Aeroporto responde conforme a solicitação\n"+
                ">>" +  Aeroporto.getInstancia().recebeAvisoDeFalhaMecanica(mensagem);
    }
}