//Класс "Молочный коктейль" с двумя абстрактными методами добавления фруктов и сладостей
public abstract class Milkshake {

    public final void makeMilkshake() {
        addMilk();
        addIceCream();
        addFruits();
        addSweeties();
    }

    public abstract void addFruits();

    public abstract void addSweeties();

    private final void addMilk() {
        System.out.println("Milk has been added.");
    }
    private final void addIceCream() {
        System.out.println("Ice-cream has been added.");
    }
}
