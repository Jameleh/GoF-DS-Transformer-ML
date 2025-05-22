package IPhone.IPhone14;

import IPhone.IPhone;

public class IPhone14 implements IPhone {
    private int serialNumber;
    private String color;
    private int ram;
    private int camera;
    private int space;

    public IPhone14(int serialNumber, String color, int ram, int camera, int space) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.ram = ram;
        this.camera = camera;
        this.space = space;
    }

    private IPhone14(IPhone14 iPhone14) {
        this.serialNumber = iPhone14.serialNumber;
        this.color = iPhone14.color;
        this.ram = iPhone14.ram;
        this.camera = iPhone14.camera;
        this.space = iPhone14.space;
    }


    @Override
    public IPhone14 clone() {
        return new IPhone14(this);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getCamera() {
        return camera;
    }

    public int getSpace() {
        return space;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
