package IPhone.IPhone15;

public class IPhone15Max extends IPhone15 {
    private boolean support4k;

    public IPhone15Max(int serialNumber, String color, int ram, int camera, int space, boolean wirelessCharging, boolean support4k) {
        super(serialNumber, color, ram, camera, space, wirelessCharging);
        this.support4k = support4k;
    }

    private IPhone15Max(IPhone15Max iPhone15Max) {
        super(iPhone15Max.getSerialNumber(),
                iPhone15Max.getColor(),
                iPhone15Max.getRam(),
                iPhone15Max.getCamera(),
                iPhone15Max.getSpace(),
                iPhone15Max.isWirelessCharging());
        this.support4k = iPhone15Max.isSupport4k();
    }

    @Override
    public IPhone15Max clone() {
        return new IPhone15Max(this);
    }

    public boolean isSupport4k() {
        return support4k;
    }

    public void setSupport4k(boolean support4k) {
        this.support4k = support4k;
    }
}
