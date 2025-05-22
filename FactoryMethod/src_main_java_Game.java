import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the number of the map type : 1.City Map 2.Wilderness Map");
        int choice = scanner.nextInt();

        Map gameMap = createMap(choice, 4, 6);

        gameMap.display();
        scanner.close();
    }

    public static Map createMap(int choice, int width, int height) {
        if (choice == 1) {
            return new CityMap(width, height);
        } else {
            return new WildernessMap(width, height);
        }
    }
}
