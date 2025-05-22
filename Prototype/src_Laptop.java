public class Laptop implements prototype{

    public Laptop(int RAM, int storage, String brand) {
        this.RAM = RAM;
        Storage = storage;
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private int RAM;
    private int Storage;
    private String brand;
    @Override
    protected Laptop clone(){
        Laptop laptop=new Laptop(this.RAM,this.Storage,this.brand);
        return laptop;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "RAM=" + RAM +"GB"+
                ", Storage=" + Storage + "GB"+
                ", brand='" + brand + '\'' +
                '}';
    }

}
