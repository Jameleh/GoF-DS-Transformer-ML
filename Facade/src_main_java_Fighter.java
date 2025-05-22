public class Fighter {
    public boolean toFight(){
        return FighterFacade.readyToFight(this);
    }
}
