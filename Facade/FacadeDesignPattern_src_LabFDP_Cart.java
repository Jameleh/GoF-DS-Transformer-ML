package LabFDP;

public class Cart implements HotelService {
    private int numberOfCarts;



    @Override
    public void execute() {
        System.out.println("Your cart request for " + numberOfCarts + " carts is being processed.\n");
    }

    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
}
