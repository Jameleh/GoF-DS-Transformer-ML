
public class Distributeur200Dirhams implements Chaine {
	private Chaine chaine;

	@Override
	public void setproChaine(Chaine proChaine) {
		this.chaine = proChaine;
	}

	@Override
	public void distribuer(Monnaie mon) {
		if (mon.getMontant() >= 200) {
			int num = mon.getMontant() / 200;
			int reste = mon.getMontant() % 200;
			System.out.println("Distribuant " + num + " billet de 200 Dirhams");
			if (reste != 0)
				this.chaine.distribuer(new Monnaie(reste));
		} else {
			this.chaine.distribuer(mon);
		}
	}

}
