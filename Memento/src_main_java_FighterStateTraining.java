public class FighterStateTraining implements FighterState{
    private FighterStateTraining() {};
    private static FighterStateTraining instance = new FighterStateTraining();
    public static FighterStateTraining getInstance(){
        return instance;
    }
    public String getState(){
        return "Lutador treinando para lutar";
    }
}
