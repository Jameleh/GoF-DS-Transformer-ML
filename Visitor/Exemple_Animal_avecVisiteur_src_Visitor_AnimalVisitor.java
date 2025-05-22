package Visitor;

import Visitable.Chat;
import Visitable.Chien;

public interface AnimalVisitor {

    public String visit(Chien chien);
    public String visit(Chat chat);
    
}

