public class Shoes extends Product{

    private  String name;
    public Shoes ( String name , int price){
        super ();
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    @Override
    public void accept ( ShoppingMallVisitor shoppingMallVisitor )
    {
            shoppingMallVisitor.visit(this);
    }

    @Override
    public  String toString(){
        return "Shoes[name=" + name + ", price=" + price + "]";
    }

}
