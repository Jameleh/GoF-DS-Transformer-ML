public class Circle implements Shape{

    private String type;

    public Circle (String type){
        this.type = type;
    }

    public Shape clone(){
        return new Circle(type);
    }

    public  void info(){
        System.out.println("Círcle " + type);
    }
}
