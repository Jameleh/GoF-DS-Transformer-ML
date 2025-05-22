abstract class Beverage {
    private void pourBeverage(int quantity) {
        System.out.println("Pour " + quantity + "ml in glass");
    }

    protected abstract void addCondiment(); // Abstract method for subclasses to implement

    protected void stir() {} // Hook method (optional override)

    private void serve() {
        System.out.println("Serve the beverage.");
    }

    public final void template(int quantity) { // Template method
        pourBeverage(quantity);
        addCondiment();
        stir();
        serve();
    }
}

class Whiskey extends Beverage {
    @Override
    protected void addCondiment() {
        System.out.println("Add soda in glass");
    }

    @Override
    protected void stir() {
        System.out.println("Stir beverage in glass");
    }
}

class Beer extends Beverage {
    @Override
    protected void addCondiment() {
        System.out.println("Add cold drink");
    }
}

public class Template {
    public static void main(String[] args) {
        Beverage b = new Whiskey();
        b.template(30); // Whiskey preparation

        b = new Beer();
        b.template(50); // Beer preparation
    }
}
