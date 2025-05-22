public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
    }

    @Override
    public Animal clone() {
        Cow cloned = new Cow();
        cloned.legs = this.legs;
        cloned.sound = this.sound;
        cloned.food = this.food;
        return cloned;
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}