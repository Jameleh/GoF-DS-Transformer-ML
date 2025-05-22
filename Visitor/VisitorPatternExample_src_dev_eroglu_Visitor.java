package dev.eroglu;

public interface Visitor {
    public double visit(Bread bread);
    public double visit(Meat meat);
    public double visit(Water water);
}
