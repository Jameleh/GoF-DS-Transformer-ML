public class BananaFactory implements GroceryProductFactory {
    private double price;

    public BananaFactory(double price) {
        this.price = price;
    }

    @Override
    public GroceryProduct createProduct() {
        return new Banana(price);
    }
}