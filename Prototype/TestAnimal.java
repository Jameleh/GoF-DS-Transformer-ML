public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Sheep sheepPrototype = new Sheep(4, "Mee", "Grass");
        Cow cowPrototype = new Cow(4, "Moo", "Hay");
        Horse horsePrototype = new Horse(4, "Hihii", "Hay", "Brown");

        registry.addPrototype("sheep", sheepPrototype);
        registry.addPrototype("cow", cowPrototype);
        registry.addPrototype("horse", horsePrototype);

        Sheep sheep1 = (Sheep) registry.getAnimal("sheep");
        if (sheep1 != null) {
            sheep1.setName("whitey");
            System.out.println("Created " + sheep1.getType() + ":");
            System.out.println("  Name: " + sheep1.getName());
            System.out.println("  Legs: " + sheep1.getLegs());
            System.out.println("  Sound: " + sheep1.getSound());
            System.out.println("  Food: " + sheep1.getFood());
            sheep1.makeSound();
            System.out.println();
        }

        Cow cow1 = (Cow) registry.getAnimal("cow");
        if (cow1 != null) {
            cow1.setName("Moocy");
            System.out.println("Created " + cow1.getType() + ":");
            System.out.println("  Name: " + cow1.getName());
            System.out.println("  Legs: " + cow1.getLegs());
            System.out.println("  Sound: " + cow1.getSound());
            System.out.println("  Food: " + cow1.getFood());
            cow1.makeSound();
            System.out.println();
        }

        Horse horse1 = (Horse) registry.getAnimal("horse");
        if (horse1 != null) {
            horse1.setName("Hiyah");
            System.out.println("Created " + horse1.getType() + ":");
            System.out.println("  Name: " + horse1.getName());
            System.out.println("  Legs: " + horse1.getLegs());
            System.out.println("  Sound: " + horse1.getSound());
            System.out.println("  Food: " + horse1.getFood());
            System.out.println("  Color: " + horse1.getColor());
            horse1.makeSound();
            System.out.println();
        }

        if (sheep1 != null) {
            Sheep sheep2 = (Sheep) registry.getAnimal("sheep");
            if (sheep2 != null) {
                sheep2.setName("Rhiea");
                System.out.println("Created " + sheep2.getType() + ":");
                System.out.println("  Name: " + sheep2.getName());
                System.out.println("  Legs: " + sheep2.getLegs());
                System.out.println("  Sound: " + sheep2.getSound());
                System.out.println("  Food: " + sheep2.getFood());
                sheep2.makeSound();
                System.out.println();
            }
        }
    }
}