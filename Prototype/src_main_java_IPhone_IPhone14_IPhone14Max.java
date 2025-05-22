package IPhone.IPhone14;

public class IPhone14Max extends IPhone14 {
    private boolean wirelessCharging;

    public IPhone14Max(int serialNumber, String color, int ram, int camera, int space, boolean wirelessCharging) {
        super(serialNumber, color, ram, camera, space);
        this.wirelessCharging = wirelessCharging;
    }

    private IPhone14Max(IPhone14Max iPhone14Max) {
        super(iPhone14Max.getSerialNumber(), iPhone14Max.getColor(), iPhone14Max.getRam(), iPhone14Max.getCamera(), iPhone14Max.getSpace());
        this.wirelessCharging = iPhone14Max.isWirelessCharging();
    }

    @Override
    public IPhone14Max clone() {
        return new IPhone14Max(this);
    }

    public boolean isWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }
}
