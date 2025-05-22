package withStrategy;

public class PassengerCar {
    public IStrategy strategy;// we donrt define this class is going to use which strategy so we dont make any object here
                                //objecrt wil bee passed by main class which will be injected in thies class uisng constructor

    PassengerCar(IStrategy strategy){
        this.strategy=strategy;
    }
    public void drive(){
        strategy.drive();
    }

}
