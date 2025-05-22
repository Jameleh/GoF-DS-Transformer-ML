package Visitor;

import Settlement.City;
import Settlement.Town;

public abstract class Visitor {
    public abstract void visit (City c);
    public abstract void visit (Town t);
    public abstract double getResult();
}
