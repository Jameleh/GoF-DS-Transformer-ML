public class AnimalRegistry{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry(Sheep sheepPrototype, Cow cowPrototype, Horse horsePrototype){
        this.sheepPrototype = sheepPrototype;
        this.cowPrototype = cowPrototype;
        this.horsePrototype = horsePrototype;
    }
        
    public Sheep createSheep(){
        return (Sheep) sheepPrototype.clone();

    }
    public Cow createCow(){
        return (Cow) cowPrototype.clone();

    }
    public Animal createHorse(){
        return (Horse) horsePrototype.clone();
        
    }
}