public class VehicleDirector {

    public static Vehicle makeC4X() {
        return new Vehicle.BuilderVehicle("C4 X").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).build();
    }

    public static Vehicle makeBMWX3() {
        return new Vehicle.BuilderVehicle("BMW X3").addOption(EBuilderVehicle.SEAT_FIVE).addOption(EBuilderVehicle.DOOR_FIVE).build();
    }
}
