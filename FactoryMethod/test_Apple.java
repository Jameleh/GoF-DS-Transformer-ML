public class Apple implements GroceryProduct {
    private double price;

    public Apple(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String s= "Apple created with price "+getPrice();
	return s;
    }
}