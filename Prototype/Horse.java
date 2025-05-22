public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Apple";
    }

    @Override
    public Animal clone() {
        Horse cloned = new Horse();
        cloned.legs = this.legs;
        cloned.sound = this.sound;
        cloned.food = this.food;
        return cloned;
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}