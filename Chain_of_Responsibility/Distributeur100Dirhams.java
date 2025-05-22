
public class Distributeur100Dirhams implements Chaine {
	private Chaine chaine;

	@Override
	public void setproChaine(Chaine proChaine) {
		this.chaine = proChaine;
	}

	@Override
	public void distribuer(Monnaie mon) {
		if (mon.getMontant() >= 100) {
			int num = mon.getMontant() / 100;
			int reste = mon.getMontant() % 100;
			System.out.println("Distribuant " + num + " billet de 100 Dirhams");
			if (reste != 0)
				this.chaine.distribuer(new Monnaie(reste));
		} else {
			this.chaine.distribuer(mon);
		}
	}

}
