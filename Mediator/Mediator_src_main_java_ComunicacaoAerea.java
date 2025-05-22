public interface ComunicacaoAerea {
    String recebePermissaoDePousar(String mensagem);
    String recebeAvisoDeColisao(String mensagem);
    String recebeAvisoDeFalhaMecanica(String mensagem);
}