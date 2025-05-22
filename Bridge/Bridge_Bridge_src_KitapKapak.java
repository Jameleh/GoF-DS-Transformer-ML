public class KitapKapak extends Kapak {

    public KitapKapak(IkapakRenk kapakrenk, IkapakBoyut kapakboyut) {
        super(kapakrenk, kapakboyut);

    }

    @Override
    public void kapakTuru() {

        System.out.println("Kitap kapağıdır. Renk: " + getKapakrenk() + ", Boyut: " + getKapakBoyut());

    }

}