public class Main {
    public static void main(String[] args) {

        IkapakRenk kirmiziRenk=new kırmızıKapak();
        IkapakBoyut a4Boyut=new a4Kapak();
        Kapak kitapKapak=new KitapKapak(kirmiziRenk,a4Boyut);
        kitapKapak.kapakTuru();

        IkapakRenk mavirenk=new maviKapak();
        IkapakBoyut a5Boyut=new a5Kapak();
        Kapak dergiKapak=new DergiKapak(mavirenk,a5Boyut);
        dergiKapak.kapakTuru();
    }
}