package Visitable;

import Visitor.AnimalVisitor;

public class Chien implements AnimalVisitable {

    public String communique() {
        return "aboie";
    }

    @Override
    public String accept(AnimalVisitor visitor) {
        return visitor.visit(this);
    }
    
}

