public class AtletaEstadoComendo implements AtletaEstado{

    private AtletaEstadoComendo() {};
    private static AtletaEstadoComendo instance = new AtletaEstadoComendo();
    public static AtletaEstadoComendo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Comendo";
    }
    public String descansando(Atleta atleta){
        return "Atleta Descansando";
    }
    public String comendo(Atleta atleta){
        return "Refeicao não iniciada";
    }
    public String treinandoMusculacao(Atleta atleta){
        return "Treino não iniciado";
    }
    public String fazendoCardio(Atleta atleta){
        return "Treino de corrida iniciado";
    }
}