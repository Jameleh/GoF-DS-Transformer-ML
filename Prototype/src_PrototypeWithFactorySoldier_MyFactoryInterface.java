package PrototypeWithFactorySoldier;

public interface MyFactoryInterface {
    Soldier createAvailableSoldier();
    Soldier createNotAvailableSoldier();
    Soldier createMorePowerfulSoldier(int power);
    Soldier createMoreHealthyfulSoldier(int health);
}
