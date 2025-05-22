import java.util.Scanner;

public class Distributeur {

	private Chaine c1;

	public Distributeur() {
		// Initialisation
		this.c1 = new Distributeur200Dirhams();
		Chaine c2 = new Distributeur100Dirhams();
		Chaine c3 = new Distributeur50Dirhams();

		// La chaine de responsabilite
		c1.setproChaine(c2);
		c2.setproChaine(c3);
	}

	public static void main(String[] args) {
		Distributeur distributeur = new Distributeur();
		while (true) {
			int montant = 0;
			System.out.println("Entrer la somme d'argent que vous voulez");
			Scanner input = new Scanner(System.in);
			montant = input.nextInt();
			if (montant % 50 != 0) {
				System.out.println("La somme doit etre multiple de 50.");
				return;
			}
			distributeur.c1.distribuer(new Monnaie(montant));
		}

	}

}
