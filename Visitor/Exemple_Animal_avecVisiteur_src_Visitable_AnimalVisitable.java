package Visitable;

import Visitor.AnimalVisitor;

public interface AnimalVisitable {

    public String communique();
    public String accept(AnimalVisitor visitor);
    
}
