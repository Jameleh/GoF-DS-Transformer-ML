public class AviaoParticular {
    public String recebePermissaoDePousar(String mensagem){
        return ControleDeTrafegoAereo.getInstancia().recebePermissaoDoPorto(mensagem);
    }

    public String recebeAvisoDeColisao(String mensagem){
        return ControleDeTrafegoAereo.getInstancia().recebeAvisoDeColisaoParaPorto(mensagem);
    }

    public String recebeAvisoDeFalhaMecanica(String mensagem){
        return ControleDeTrafegoAereo.getInstancia().recebeAvisoDeFalhaMecanicaNoPorto(mensagem);
    }
}