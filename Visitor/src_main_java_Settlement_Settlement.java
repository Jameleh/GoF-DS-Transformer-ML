package Settlement;

import Visitor.Visitor;

public abstract class Settlement {
    public int numberOfAdults;
    public int numberOfChildren;
    public int numberOfElderly;
    public abstract void acceptVisitor(Visitor v);

    public Settlement(int numberOfAdults, int numberOfChildren, int numberOfElderly) {
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.numberOfElderly = numberOfElderly;
    }
}
