public interface Filter {
    void setNext (Filter filter);
    void handle (Request request);
    boolean hasNext();
}
