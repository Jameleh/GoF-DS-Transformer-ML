package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Estadio implements  Iterable<Torcedor>{

    private List<Torcedor> torcedores = new ArrayList<Torcedor>();

    public Estadio(Torcedor... torcedores){
        this.torcedores = Arrays.asList(torcedores);
    }

    @Override
    public Iterator<Torcedor> iterator() {
        return torcedores.iterator();
    }
}
