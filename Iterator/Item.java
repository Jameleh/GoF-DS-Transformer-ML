package iteratorDesignPattern;
/**
 * 
 * @author Austin Odell
 *
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Creates an instance of Item
     * @param title of the items name
     * @param description the items description
     * @param price the items price
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Get method for the items price
     * @return The items price
     */
    public double getPrice() {
        return price;
    }

    /**
     * toString to print items info
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * A string containing all properties of the item
     * @return the unique string of the item
     */
    @Override
    public String toString() {
        return "***** " + title + " *****\n" + description + "\nPrice: $" + price + "\n";
    }
}
