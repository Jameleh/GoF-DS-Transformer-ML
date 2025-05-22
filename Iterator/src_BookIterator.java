public class BookIterator implements Iterator {
    private final Book[] books;
    private int position = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    public Book next() {
        return books[position++];
    }
}
