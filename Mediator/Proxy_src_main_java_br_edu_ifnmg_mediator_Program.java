package br.edu.ifnmg.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {
        String planesNames[] = {"AB12", "CD34", "EF56"};
        List<Plane> planes = new ArrayList<Plane>();
        ATC atc = new ATC("HKX");
        for (int i = 0; i < planesNames.length; i++) {
            planes.add(new Plane(atc, planesNames[i]));
        }
        atc.setContactedPlanes(planes);

        atc.execute();
    }
}
