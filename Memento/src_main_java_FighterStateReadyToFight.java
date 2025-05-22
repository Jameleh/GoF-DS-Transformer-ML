public class FighterStateReadyToFight implements FighterState{
    private FighterStateReadyToFight() {};
    private static FighterStateReadyToFight instance = new FighterStateReadyToFight();
    public static FighterStateReadyToFight getInstance(){
        return instance;
    }
    public String getState(){
        return "Lutador pronto para lutar";
    }
}
