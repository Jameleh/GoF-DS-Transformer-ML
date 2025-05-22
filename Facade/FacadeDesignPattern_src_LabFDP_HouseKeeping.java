package LabFDP;

import LabFDP.HouseKeeping;
  

public class HouseKeeping implements HotelService {
   private int roomNumber;

    @Override
    public void execute() {
        System.out.println("Room " + roomNumber + " is requesting for housekeeper to clean the room.\n");

    }

    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
