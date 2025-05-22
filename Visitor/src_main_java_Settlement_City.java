package Settlement;

import Visitor.Visitor;

public class City extends Settlement {
    public City(int numberOfAdults, int numberOfChildren, int numberOfElderly) {
        super(numberOfAdults, numberOfChildren, numberOfElderly);
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }


}
