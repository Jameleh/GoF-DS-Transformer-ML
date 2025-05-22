import java.util.Iterator;

public class Control {

    public static Integer payingAudience(Arena arena){
        int payingSpectator = 0;
        for(Viewer viewer: arena){
            if(viewer.getHasPaidTicket()) payingSpectator++;
        }
        return payingSpectator;
    }

    public static Integer presentAudience(Arena arena){
        int spectatorPresent = 0;
        for(Iterator a = arena.iterator(); a.hasNext();){
            spectatorPresent++;
            a.next();
        }
        return spectatorPresent;
    }
}