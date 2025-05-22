package fr.mds.designpattern.command.entity;

public class Stock {
    private String name;
    private int quantity = 0;
    private GlobalStock globalStock;

    public Stock() {
    }

    public Stock(String name) {
        this.name = name;
    }

    public void addQuantity(int q) {
        this.quantity = quantity + q;
    }

    public void removeQuantity(int q) {
        this.quantity = quantity - q;
    }

    public Stock(String name, int quantity, GlobalStock globalStock) {
        this.name = name;
        this.quantity = 0;
        this.globalStock = globalStock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public GlobalStock getGlobalStock() {
        return globalStock;
    }

    public void setGlobalStock(GlobalStock globalStock) {
        this.globalStock = globalStock;
    }

    @Override
    public String toString() {
        return "Stock [" +
                "Name : " + name +
                ", Quantity : " + quantity +
                ']';
    }
}
