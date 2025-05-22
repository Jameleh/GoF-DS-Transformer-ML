import java.util.*;

public class Library implements Aggregate {
    private ArrayList<Books>list;
    Library(ArrayList<Books>list){
        this.list=list;
    }
    public Iterator createIterator(){
        return new BookIterator(this.list);
    }
}
