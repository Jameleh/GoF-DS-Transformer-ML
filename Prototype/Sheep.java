public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Mee Mee";
        this.food = "Grass";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        Sheep cloned = new Sheep();
        cloned.legs = this.legs;
        cloned.sound = this.sound;
        cloned.food = this.food;
        cloned.name = this.name;
        return cloned;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}