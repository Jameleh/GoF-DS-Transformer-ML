package abstractfactory.example.pizza;

public abstract class Pizza {

    public abstract String getName();

    public abstract int getSize();

    public abstract String getIngredients();

    @Override
    public String toString() {
        return "Pizza= " + this.getName() + ", Size= " + this.getSize() + ", Ingredients= " + this.getIngredients();
    }
}
