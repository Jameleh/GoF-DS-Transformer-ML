package strategy.example;

public class Cash implements Payment {

    public Cash(){

    }

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount + "$, paid whit cash");
    }

}