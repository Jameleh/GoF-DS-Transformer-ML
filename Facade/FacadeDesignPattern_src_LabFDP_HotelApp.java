package LabFDP;

public class HotelApp {

  public static void main(String[] args) {
    FrontDesk frontDesk = new FrontDesk();
    frontDesk.ValetService("CuTE01");
    frontDesk.HouseKeepingService(79);
    frontDesk.CartService(12);
  }
}
