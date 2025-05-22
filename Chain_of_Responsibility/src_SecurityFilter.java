public class SecurityFilter implements Filter {
    private Filter filter;
    public boolean hasNext () {
        if (filter == null) {
            return false;
        }
        return true;
    }
    public void setNext (Filter filter) {
        this.filter = filter;
    }
    public void handle (Request request) {
        if (hasNext()) {
            filter.handle(request);
        }
    }
}
