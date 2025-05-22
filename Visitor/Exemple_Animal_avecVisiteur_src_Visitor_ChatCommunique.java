package Visitor;

import Visitable.Chat;
import Visitable.Chien;

public class ChatCommunique implements AnimalVisitor{

    // This is created so that each item is sent to the 
    // right version of visit() which is required by
    // the Visitor interface and defined below
    public ChatCommunique() {
        
    }



    @Override
    public String visit(Chien chien) {
        return "CHAT communique avec un Chien";
    }

    @Override
    public String visit(Chat chat) {
        return "CHAT communique avec un Chat";
    }
    
}

