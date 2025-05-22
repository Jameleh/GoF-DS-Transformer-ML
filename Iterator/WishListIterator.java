package iteratorDesignPattern;

public class WishListIterator implements Iterator {
    Item[] items;
    int position;
    /**
     * Creates the iterator
     * @param items the array of items to be iterated over
     */
    public WishListIterator(Item[] items) {
        this.items = items;
        position = 0;
    }

    /**
     * Advances the index, and returns the next item in the WishList
     * @return next item
     */
    public Item next() {
        position++;
        return items[position - 1];
    }

    /**
     * If there are more items to be iterated over, this method returns true
     * @return true if another item exists
     */
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}