import java.util.ArrayList;

public class Contexte {
    private final Tri tri;
    public Contexte(Tri tri){
        this.tri=tri;
    }
    public void afficherTri(ArrayList<Integer> input){
        tri.trier(input);
        for (Integer integer : input) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
