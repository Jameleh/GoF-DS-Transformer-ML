public class FighterStateWeightCut implements FighterState{
    private FighterStateWeightCut() {};
    private static FighterStateWeightCut instance = new FighterStateWeightCut();
    public static FighterStateWeightCut getInstance(){
        return instance;
    }
    public String getState(){
        return "Lutador perdendo peso para luta";
    }
}
