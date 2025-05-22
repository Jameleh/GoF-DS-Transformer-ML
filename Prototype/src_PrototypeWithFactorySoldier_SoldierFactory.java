package PrototypeWithFactorySoldier;

public class SoldierFactory implements MyFactoryInterface {

    //Asker nesnelerinin oluşturulacağı fabrika sınıfına belirlenen methodları içeren interface implement edildi.

    private static Soldier availableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Kilic", true);
    private static Soldier notAvailableSoldier = new Soldier(100, 45, 20, 50, 60, 5, "Kilic", false);

    @Override
    public Soldier createAvailableSoldier() {
        return availableSoldier;
    }

    @Override
    public Soldier createNotAvailableSoldier() {
        return notAvailableSoldier;
    }

    @Override
    public Soldier createMorePowerfulSoldier(int power) {
        Soldier soldier = (Soldier) availableSoldier.clone();
        soldier.setPower(power);
        return soldier;
    }

    @Override
    public Soldier createMoreHealthyfulSoldier(int health) {
        Soldier soldier = (Soldier) availableSoldier.clone();
        soldier.setHealth(health);
        return soldier;
    }
}
