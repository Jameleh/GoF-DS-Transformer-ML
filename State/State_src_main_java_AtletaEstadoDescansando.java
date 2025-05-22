public class AtletaEstadoDescansando implements AtletaEstado{

    private AtletaEstadoDescansando() {};
    private static AtletaEstadoDescansando instance = new AtletaEstadoDescansando();
    public static AtletaEstadoDescansando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Descansando";
    }
    public String descansando(Atleta atleta){
        return "Atleta não pode iniciar Descanso";
    }
    public String comendo(Atleta atleta){
        atleta.setEstado(AtletaEstadoComendo.getInstance());
        return "Refeicao iniciada";
    }

    public String treinandoMusculacao(Atleta atleta){
        atleta.setEstado(AtletaEstadoTreinandoMusculacao.getInstance());
        return "Treino de natação iniciado";
    }

    public String fazendoCardio(Atleta atleta){
        atleta.setEstado(AtletaEstadoFazendoCardio.getInstance());
        return "Treino de corrida iniciado";
    }
}