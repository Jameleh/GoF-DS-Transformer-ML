import Settlement.City;
import Visitor.SumVisitor;

public class Main {
    public static void main(String args[])
    {
        SumVisitor v = new Visitor.SumVisitor();
        City newCity = new City(5000, 1000, 850);

        newCity.acceptVisitor(v);
        System.out.println(v.getResult());
        System.out.println("Works");
    }
}
