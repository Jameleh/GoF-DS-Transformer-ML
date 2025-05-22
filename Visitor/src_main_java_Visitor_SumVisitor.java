package Visitor;

import Settlement.City;
import Settlement.Town;

public class SumVisitor extends Visitor{
    int sum=0;
    @Override
    public void visit(City c) {
        sum= c.numberOfChildren+
                c.numberOfAdults+
                c.numberOfElderly;
    }

    @Override
    public void visit(Town t) {
        sum= t.numberOfChildren+
                t.numberOfAdults+
                t.numberOfElderly;
    }

    @Override
    public double getResult() {
        int temp = sum;
        sum = 0;
        return temp;
    }
}
