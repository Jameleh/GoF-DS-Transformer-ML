package PrototypeDesignPattern;

public abstract class Book implements Cloneable {
    private String bookCategory;
    private int price;

    public String getBookCategory(){
        return bookCategory;
    }

    public void setBookCategory(String bookCategory){
        this.bookCategory=bookCategory;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone(); // goes to super class's clone method.
    }
}
