public class Terminal implements Observer {

    private float temperature;
    private float humidite;
    private float pression;

    public void afficher() {
        System.out.println("\nConditions actuelles:"+ temperature+" degrès , "+humidite+" % d'humidité et de pression : " +pression +"\n" );
    }

    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature=temperature;
        this.humidite=humidite;
        this.pression=pression;
        afficher();
    }

    @Override
    public void update(Observable o) {
    this.actualiser(((DonneesMeteo)o).getTemperature(),((DonneesMeteo)o).getHumidite(), ((DonneesMeteo)o).getPression());
    }
}
