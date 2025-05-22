import java.util.ArrayList;
import java.util.WeakHashMap;

class CoffeeFlavour {
    private final String name;
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();

    // only intern() can call this constructor
    private CoffeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static CoffeeFlavour intern(String name) {
        synchronized (CACHE) {
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    public static int flavoursInCache() {
        synchronized (CACHE) {
            return CACHE.size();
        }
    }
}

@FunctionalInterface
interface Order {
    void serve();

    static Order of(String flavourName, int tableNumber) {
        CoffeeFlavour flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Servis ∼ " + flavour + " ∼ Masa Numarası " + tableNumber);
    }
}

class CoffeeShop {
    private final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableNumber) {
        orders.add(Order.of(flavour, tableNumber));
    }

    public void service() {
        orders.forEach(Order::serve);
    }
}




public class FlyweightExample {

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();
        shop.takeOrder("Türk Kahvesi", 2);
        shop.takeOrder("Cappuccino", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Cappuccino", 4);
        shop.takeOrder("Türk Kahvesi", 5);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Türk Kahvesi", 3);
        shop.takeOrder("Espresso", 6);
        shop.takeOrder("Cappuccino", 7);
        shop.takeOrder("Türk Kahvesi", 8);
        shop.takeOrder("Espresso", 8);

        shop.service();
        System.out.println("");
        System.out.println("Bulunan kahve çeşitleri : " + CoffeeFlavour.flavoursInCache());
  }

	}


