package PrototypeWithFactorySoldier;

public class Run {
    public static void main(String[] args) {
        /*
          PrototypeSoldier projesinde Prototype Design Pattern uygulayarak nesne kopyalanmıştı fakat sadece bir nesne oluştururarak kopyalandı.
          Nesne özellikleri, nesne çeşitleri ve nesne sayıları arttıkça bu karmaşaya ve kod fazlalığına sebep olacaktır.
          Bu problemi çözmek için prototype ve factory design pattern birlikte kullanılabilir.
        * */

        SoldierFactory soldierFactory = new SoldierFactory();

        Soldier availableSoldier = soldierFactory.createAvailableSoldier();
        Soldier notAvailableSoldier = soldierFactory.createNotAvailableSoldier();

        Soldier morePowerfulSoldier = soldierFactory.createMorePowerfulSoldier(100);
        Soldier moreHealthySoldier = soldierFactory.createMoreHealthyfulSoldier(150);

        System.out.println("------------------------availableSoldier------------------------");
        availableSoldier.showSoldierInfo();
        System.out.println("------------------------notAvailableSoldier------------------------");
        notAvailableSoldier.showSoldierInfo();
        System.out.println("------------------------morePowerfulSoldier------------------------");
        morePowerfulSoldier.showSoldierInfo();
        System.out.println("------------------------moreHealthySoldier------------------------");
        moreHealthySoldier.showSoldierInfo();
    }
}
