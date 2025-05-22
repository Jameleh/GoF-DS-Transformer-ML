package Visitable;

import Visitor.AnimalVisitor;

public class Chat implements AnimalVisitable {

    public String communique() {
        return "miaule";
    }

    @Override
    public String accept(AnimalVisitor visitor) {
        return visitor.visit(this);
    } 
    
}

