public class FighterStateSignedFightContract implements FighterState{
    private FighterStateSignedFightContract() {};
    private static FighterStateSignedFightContract instance = new FighterStateSignedFightContract();
    public static FighterStateSignedFightContract getInstance(){
        return instance;
    }
    public String getState(){
        return "Lutador com contrato de luta assinado";
    }
}
