public class FighterStateSuspended implements FighterState{
    private FighterStateSuspended() {};
    private static FighterStateSuspended instance = new FighterStateSuspended();
    public static FighterStateSuspended getInstance(){
        return instance;
    }
    public String getState(){
        return "Lutador suspenso";
    }
}
