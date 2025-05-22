package iteratorDesignPattern;

/**
 * 
 * @author Austin Odell
 *
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count;

    /**
     * Creates a wish list
     * @param Name of the wish list
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[5];
        count = 0;
    }
    /**
     * Adds an item to this wish list, grows the array if it's full
     * @param title The name of the item
     * @param description The description of the item
     * @param price The price of the item
     */
    public void addItem(String title, String description, double price) {
        if(count >= items.length)
            growArray();
        items[count] = new Item(title, description, price);
        count ++;
    }
    /**
     * Creates an item for the list of items
     * @return the iterator
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * Gets the total cost of all items in the array
     * @return the total cost
     */
    public double getTotalCost() {
        double total = 0.0;
        for(int i = 0; i < count; i ++)
            total += items[i].getPrice();
        return total;
    }

    /**
     * Resizes the array to double the previous one
     */
    private void growArray() {
        Item[] tmp = new Item[items.length * 2];
        for(int i = 0; i < items.length; i ++)
            tmp[i] = items[i];
        items = tmp;
    }
}