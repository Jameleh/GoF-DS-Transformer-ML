public class Meal {
    private String burger;
    private String side;
    private Meal(Builder builder) {
        this.burger = builder.burger;
        this.side = builder.side;
    }
    public static class Builder {
        private String burger;
        private String side;
        public Builder addBurger(String burger) {
            this.burger = burger;
            return this;
        }
        public Builder addSide(String side) {
            this.side = side;
            return this;
        }
        public Meal build() {
            return new Meal(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Meal.Builder()
                .addBurger("Cheeseburger")
                .addSide("Fries")
                .build();
        Meal meal2 = new Meal.Builder()
                .addBurger("Chicken Burger")
                .build();
        System.out.println("Meal 1: " + meal1.toString());
        System.out.println("Meal 2: " + meal2.toString());
    }
}
