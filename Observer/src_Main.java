public class Main {
    public static void main(String[] args) {

        DonneesMeteo dm =new DonneesMeteo();
        Terminal t1 = new Terminal();
        dm.addObserver(t1);
        dm.setMesures(13,22,65);
        dm.setMesures(4,22,69);


    }
}
