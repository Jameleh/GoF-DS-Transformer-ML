package LabFDP;
public class FrontDesk {
    private Valet valet = new Valet();
    private HouseKeeping houseKeeping = new HouseKeeping ();
    private Cart cart = new Cart();

    public void ValetService(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
        valet.execute();
    }

    public void HouseKeepingService(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
        houseKeeping.execute();
    }

    public void CartService(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
        cart.execute();
    }
}
