public class BookCollection implements IteratableCollection{
    private final int MAX_SIZE = 20;
    private final Book[] books;
    private int count = 0;

    public BookCollection() {
        books = new Book[MAX_SIZE];
    }

    public void addBook(Book book) {
        if (count < MAX_SIZE) {
            books[count++] = book;
        } else {
            System.out.println("Collection is full, cannot add new book to collection");
        }
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
