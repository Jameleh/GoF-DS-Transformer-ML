//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // temel ev planı
        Ev ev = new TemelEv();
        System.out.println(ev.aciklama() + "-> Fiyat: " + ev.fiyat() + "TL");

        // temel ev planına bir oda eklenmesi
        ev = new OdaDecorator(ev);
        System.out.println(ev.aciklama() + "-> Fiyat: " + ev.fiyat() + "TL");

        // temel ev planına  bir kapı eklenmesi
        ev = new KapiDecorator(ev);
        System.out.println(ev.aciklama() + "-> Fiyat: " + ev.fiyat() + "TL");

        // temel ev planına bir pencere eklenmesi
        ev = new PencereDecorator(ev);
        System.out.println(ev.aciklama() + "-> Fiyat: " + ev.fiyat() + "TL");

        // plana tekrar bir oda, kapı pencere isteniyorsa
        ev = new OdaDecorator(ev);
        ev = new KapiDecorator(ev);
        ev = new PencereDecorator(ev);
        System.out.println(ev.aciklama() + "-> Fiyat: " + ev.fiyat() + "TL");





    }
}