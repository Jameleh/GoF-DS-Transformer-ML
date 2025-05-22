package strategy.exercise;

import strategy.example.Payment;

public class GooglePay implements Payment {

    private String email;
    private String pass;

    public GooglePay(String email, String pass){
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + (amount * 0.9) + "$, paid whit GooglePay");
    }
}
