public class AppleFactory implements GroceryProductFactory {
    private double price;

    public AppleFactory(double price) {
        this.price = price;
    }

    @Override
    public GroceryProduct createProduct() {
        return new Apple(price);
    }
}