public class Square implements Shape{

    private String type;

    public Square (String type){
        this.type = type;
    }

    public Shape clone(){
        return new Square(type);
    }

    public  void info(){
        System.out.println("Square " + type);
    }
}