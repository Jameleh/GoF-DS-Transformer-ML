package Visitor;

import Visitable.Chat;
import Visitable.Chien;

public class ChienCommunique implements AnimalVisitor{

    // This is created so that each item is sent to the 
    // right version of visit() which is required by
    // the Visitor interface and defined below
    public ChienCommunique() {
        
    }



    @Override
    public String visit(Chat chat) {
        return "CHIEN communique avec un Chat";
    }

    @Override
    public String visit(Chien chien) {
        return "CHIEN communique avec un Chien";
    }

    
}

