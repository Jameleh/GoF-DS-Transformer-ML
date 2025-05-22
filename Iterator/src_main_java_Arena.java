import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arena implements  Iterable<Viewer>{

    private List<Viewer> viewers = new ArrayList<Viewer>();

    public Arena(Viewer... viewers){
        this.viewers = Arrays.asList(viewers);
    }

    @Override
    public Iterator<Viewer> iterator() {
        return viewers.iterator();
    }
}