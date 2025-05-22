import java.sql.SQLOutput;
import java.text.DecimalFormat;


public class Store {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("₱#,###.00");

        Furniture bed = new Furniture("Bed", 5000.00, 3.0); // Ship Distance in KM. Calculation for Ship Fee is ShipCost * Distance
        Furniture chair = new Furniture("Chair", 200.00, 5.0);
        Furniture lamp = new Furniture("Lamp", 150.00, 2.0);
        Furniture cabinet = new Furniture("Cabinet", 7000.00, 10.5);

        BulkyCalculator bulkyCalculator = new HeavyFurniture();
        LightCalculator lightCalculator = new LightFurniture();

        
        System.out.println("Item: " + bed.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(bed.getPrice()));
        System.out.println("Shipping Distance: " + bed.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(bed.accept(bulkyCalculator, bed.getPrice(), bed.getShipDistance())));

        System.out.println("Item: " + lamp.getFurnitureType());
        System.out.println("Item Original Price: " + df.format(lamp.getPrice()));
        System.out.println("Shipping Distance: " + lamp.getShipDistance() + " km");
        System.out.println("Final Cost: " + df.format(lamp.accept(lightCalculator, lamp.getPrice())));

    }
}