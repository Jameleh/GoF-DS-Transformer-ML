package dev.eroglu;

public interface Visitable {
    public double accept(Visitor visitor);
}
