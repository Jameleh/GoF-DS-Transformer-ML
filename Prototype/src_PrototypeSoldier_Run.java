package PrototypeSoldier;

public class Run {
    public static void main(String[] args) {
        /*
          Prototype Design Pattern, Varoluşsal(Creatinoal) tasarım desenlerinden biridir.
          Aynı sınıftan üretilecek olan ve pek çok ortak özelliği bulunan benzer nesnelerin üretimi sırasında
          gerçekleşebilecek karışıklıkları engellemek ve üretim maliyetini azaltmak amacı ile kullanılır.

          Karmaşık nesneleri sıfırdan oluşturmak yerine, hali hazırda elde var olan nesnelerden kopyalanarak
          elde etme yonuna gidilebilir. Durumu kopyalanarak çoğaltılan nesne prototip ya da örnek nesnedir.

          Prototip-örnek olarak oluşturulan nesne, aynı sınıftan diğer nesneler için bir başlangıç noktası olur.
          Kopyalama ile elde edilen nesnenin durumu prototip nesne ile aynıdır.
          Yeni nesne üzerinde yapılmak istenen değişiklikler nesne üzerindeki set metotları ile yapılır.
        * */

        //Savas için hazır olan(isAvailableForWar=True) bir asker nesnesi olusturduk
        Soldier availableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Kilic", true);

        //availableSoldier nesnesini kopyalarak setter methodu ile savaşa hazır durumunu(isAvailableForWar) değiştirdik
        Soldier notAvailableSoldier = (Soldier) availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);

        System.out.println("------------------------availableSoldier------------------------");
        availableSoldier.showSoldierInfo();
        System.out.println("------------------------notAvailableSoldier------------------------");
        notAvailableSoldier.showSoldierInfo();
    }
}
