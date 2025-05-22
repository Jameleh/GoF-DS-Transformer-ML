public class AtletaAcaoTreinandoMusculacao implements AtletaAcao{
    private AtletaAcaoTreinandoMusculacao() {};
    private static AtletaAcaoTreinandoMusculacao instance = new AtletaAcaoTreinandoMusculacao();
    public static AtletaAcaoTreinandoMusculacao getInstance(){
        return instance;
    }
    public String getNomeAcao(){
        return "Treinando Musculacao";
    }
}