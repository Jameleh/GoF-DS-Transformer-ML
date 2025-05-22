public class AtletaAcaoComendo implements AtletaAcao{

    private AtletaAcaoComendo() {};
    private static AtletaAcaoComendo instance = new AtletaAcaoComendo();
    public static AtletaAcaoComendo getInstance(){
        return instance;
    }
    public String getNomeAcao(){
        return "Comendo";
    }
}