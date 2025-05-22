public class FighterFacade {
    public static boolean readyToFight(Fighter fighter){
        if(Contract.getInstancia().checkFight(fighter)){
            return false;
        }
        if(AntiDoping.getInstancia().checkFight(fighter)){
            return false;
        }
        if(Weighing.getInstancia().checkFight(fighter)){
            return false;
        }
        return true;
    }
}
