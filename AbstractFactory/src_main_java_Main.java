import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose UI Style A or B: ");
        String choice = scanner.nextLine().trim().toUpperCase();

        UIFactory factory;

        if (choice.equals("A")) {
            factory = new AFactory();
        } else if (choice.equals("B")) {
            factory = new BFactory();
        } else {
            System.out.println("Invalid choice. Defaulting to Style A.");
            factory = new AFactory();
        }

        Button button = factory.createButton("Submit");
        TextField textField = factory.createTextField("Enter your name");
        Checkbox checkbox = factory.createCheckbox("Argee to terms and conditions");

        button.display();
        textField.display();
        checkbox.display();

        System.out.println();
        button.setText("Confirm");
        textField.setText("Enter your email");
        checkbox.setText("Subscribe to newsletter");

        button.display();
        textField.display();
        checkbox.display();

        scanner.close();
    }
}
