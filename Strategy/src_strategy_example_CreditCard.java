package strategy.example;

public class CreditCard implements Payment {

    private String fullName;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String fullName, String cardNumber, String cvv, String dateOfExpiry) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount + "$, paid whit credit card");
    }

}