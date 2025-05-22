public class AtletaAcaoDescansando implements AtletaAcao{

    private AtletaAcaoDescansando() {};
    private static AtletaAcaoDescansando instance = new AtletaAcaoDescansando();
    public static AtletaAcaoDescansando getInstance(){
        return instance;
    }
    public String getNomeAcao(){
        return "Descansando";
    }

}