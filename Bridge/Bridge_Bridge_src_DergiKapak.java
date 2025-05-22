public class DergiKapak extends Kapak{

    public DergiKapak(IkapakRenk kapakrenk, IkapakBoyut kapakboyut) {
        super(kapakrenk, kapakboyut);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void kapakTuru() {
        System.out.println("Dergi kapağıdır.Renk:" + getKapakrenk() + ", Boyut: " + getKapakBoyut());

    }

}