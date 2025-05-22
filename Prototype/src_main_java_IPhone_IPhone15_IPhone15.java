package IPhone.IPhone15;

import IPhone.IPhone;

public class IPhone15 implements IPhone {
    private int serialNumber;
    private String color;
    private int ram;
    private int camera;
    private int space;
    private boolean wirelessCharging;

    public IPhone15(int serialNumber,String color,int ram,int camera,int space,boolean wirelessCharging) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.ram = ram;
        this.camera = camera;
        this.space = space;
        this.wirelessCharging = wirelessCharging;
    }

    private IPhone15(IPhone15 iPhone15) {
        this.serialNumber = iPhone15.serialNumber;
        this.color = iPhone15.color;
        this.ram = iPhone15.ram;
        this.camera = iPhone15.camera;
        this.space = iPhone15.space;
        this.wirelessCharging = iPhone15.wirelessCharging;
    }


    @Override
    public IPhone15 clone() {
        return new IPhone15(this);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean isWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }
}
