
public class Distributeur50Dirhams implements Chaine{
	private Chaine chaine;

	@Override
	public void setproChaine(Chaine proChaine) {
		this.chaine = proChaine;
	}

	@Override
	public void distribuer(Monnaie mon) {
		if (mon.getMontant() >= 50) {
			int num = mon.getMontant() / 50;
			int reste = mon.getMontant() % 50;
			System.out.println("Distribuant " + num + " billet de 50 Dirhams");
			if (reste != 0)
				this.chaine.distribuer(new Monnaie(reste));
		} else {
			this.chaine.distribuer(mon);
		}
	}

}
