public class Sheep implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep (int legs, String sound, String food, String name){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }
    @Override
    public Animal clone(){
        return new Sheep (this.legs, this.sound, this.food, this.name);
    }
    
    @Override
    public String getType(){
        return "Sheep";
    }

    @Override
    public void makeSound(){
        System.out.println("Sheep sound: " + this.sound);
    }

}