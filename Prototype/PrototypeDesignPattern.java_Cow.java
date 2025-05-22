public class Cow implements Animal{
    private int legs;
    private String sound;
    private String food;

    public Cow (int legs, String sound, String food){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }
   @Override
    public Animal clone(){
        return new Cow (this.legs, this.sound, this.food);
    }
    
    @Override
    public String getType(){
        return "Cow";
    }

    @Override
    public void makeSound(){
        System.out.println("Cow sound: " + this.sound);
    }
    }