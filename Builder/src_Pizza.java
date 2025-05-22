import java.util.ArrayList;
// Product
public class Pizza {
    private String base;
    private int taille;
    private boolean estPateEpaisse;
    private ArrayList<String> garnitures;

    private Pizza(PizzaBuilder builder) {
        this.base = builder.base;
        this.taille = builder.taille;
        this.estPateEpaisse = builder.estPateEpaisse;
        this.garnitures = builder.garnitures;
    }

    public String getBase() {
        return base;
    }

    public int getTaille() {
        return taille;
    }

    public boolean getEstPateEpaisse() {
        return estPateEpaisse;
    }

    public ArrayList<String> getGarnitures() {
        return garnitures;
    }

    public String toString() {
        String result = "";

        result += "Pizza base: " + this.base + ", ";
        result += "taille: " + this.taille + ", ";
        result += "pâte épaisse: " + (this.estPateEpaisse ? "vrai" : "faux")  + ", ";
        result += "pâte garnitures: ";
        for (String garniture : this.garnitures) {
            result += garniture  + ", ";
        }

        return result;
    }

    // ConcreteBuilder
    public static class PizzaBuilder implements IPizzaBuilder {
        private String base = "Tomate";
        private int taille = 30;
        private boolean estPateEpaisse = false;
        private ArrayList<String> garnitures = new ArrayList<>();;

        public PizzaBuilder(String base, int taille) {
            this.base = base;
            this.taille = taille;
        }

        public PizzaBuilder estPateEpaisse(boolean valeur) {
            this.estPateEpaisse = valeur;
            return this;
        }

        public PizzaBuilder garnitures(String garniture) {
            this.garnitures.add(garniture);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
