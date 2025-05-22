package visitor.example;

public interface Item {

    public int accept(ShoppingCart visitor);
}