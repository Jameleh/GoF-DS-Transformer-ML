public class Color implements Animal{
    int legs;
    String sound;
    String food;
    String color;

    public Color(int legs, String sound, String food, String color){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }
    @Override
    public Animal clone(){
        return new Color(this.legs, this.sound, this.food, this.color);
    }
    @Override
    public void makeSound(){
        System.out.println(sound);
    }
    @Override
    public String getType(){
        return "Color";
    }
}
