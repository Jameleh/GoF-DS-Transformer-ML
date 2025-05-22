public class Banana implements GroceryProduct {
    private double price;
    
    public Banana(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
	String s="Banana created with price "+this.price;
	return s;
    }
}