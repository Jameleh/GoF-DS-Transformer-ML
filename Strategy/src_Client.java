import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Contexte ctx = new Contexte(new TriInsertion());
        ArrayList<Integer> array = new ArrayList<>();
        int choix = 0;
        while (choix != 3) {
            Scanner clavier = new Scanner(System.in);
            System.out.println("Veuillez saisir:");
            System.out.println("1 pour le tri par insertion");
            System.out.println("2 pour le tri par selection");
            System.out.println("3 pour quitter");
            choix= clavier.nextInt();
            clavier.nextLine();
            if(choix==3){break;}
            System.out.println("Entrez les nombres à trier");
            String[] stringList = clavier.nextLine().split("\\s+");
            for (String elt : stringList) {
                array.add(Integer.valueOf(elt));
            }

            switch (choix) {
                case 1 -> {
                    ctx.afficherTri(array);
                    Thread.sleep(1000);
                }
                case 2 -> {
                    ctx = new Contexte(new TriSelection());
                    ctx.afficherTri(array);
                    Thread.sleep(1000);
                }
            }
        }
        System.out.println("Bonne journée");
    }
}
