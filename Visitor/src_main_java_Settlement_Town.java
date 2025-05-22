package Settlement;

import Visitor.Visitor;

public class Town extends Settlement{
    public Town(int numberOfAdults, int numberOfChildren, int numberOfElderly) {
        super(numberOfAdults, numberOfChildren, numberOfElderly);
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }
}
